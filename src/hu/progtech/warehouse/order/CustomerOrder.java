package hu.progtech.warehouse.order;

import hu.progtech.warehouse.WarehouseManager;
import hu.progtech.warehouse.factory.ItemType;
import hu.progtech.warehouse.partner.Payable;
import hu.progtech.warehouse.storage.StockItem;
import hu.progtech.warehouse.storage.Storage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/** Order child class, to represent customer orders */
public class CustomerOrder extends Order {

    /** additional OrderItems to the list, because of the multiple buying prices at different purchases problem */
    private final List<OrderItem> additionalItems = new ArrayList<>();

    public CustomerOrder(int orderId) {
        super(orderId);
    }

    /** Creates a Payable that will be paid to us (positive value) */
    @Override
    Payable createPayable() {
        Payable newInvoice  = new Payable(this);
        BigDecimal invoiceValue = this.getItems().stream()
                .reduce(new BigDecimal(0), (a, b) -> a.add(b.getSellingPrice()), BigDecimal::add);
        newInvoice.setValue(invoiceValue);
        return newInvoice;
    }

    @Override
    void updateStock() {
        this.getItems().forEach(orderItem -> {
            List<Storage> suitableStorages = WarehouseManager.getWarehouseManager().getStorageManagement().getAll()
                    .stream().filter(storage -> storage.getAllowedCommodities().contains(orderItem.getProduct().getProductType()))
                    .collect(Collectors.toList());
            if (suitableStorages.size() == 0) {
                System.out.println("Insufficient items:" + orderItem.getProduct().getName() + "!");
            } else {
                int requiredQuantity = orderItem.getQuantity();
                while (0 < requiredQuantity) {
                    int previousQuantity = requiredQuantity;
                    BigDecimal previousBuyingPrice = orderItem.getBuyingPrice();
                    requiredQuantity = searchNextStock(orderItem, requiredQuantity, suitableStorages);
                    if (previousBuyingPrice != null && !previousBuyingPrice.equals(orderItem.getBuyingPrice())) {
                        handleMultipleBuyingPrices(orderItem, requiredQuantity, previousQuantity, previousBuyingPrice);
                    }

                }
                orderItem.setQuantity(orderItem.getQuantity() + requiredQuantity);
            }
        });
        additionalItems.forEach(orderItem -> this.getItems().add(orderItem));
    }

    private void handleMultipleBuyingPrices(OrderItem orderItem, int requiredQuantity, int previousQuantity, BigDecimal previousBuyingPrice) {
        OrderItem newItem = (OrderItem) WarehouseManager.getWarehouseManager().getItemProvider()
                .createItem(ItemType.ORDER_ITEM, orderItem.getProduct());
        newItem.setQuantity(previousQuantity - requiredQuantity);
        newItem.setBuyingPrice(orderItem.getBuyingPrice());
        orderItem.setBuyingPrice(previousBuyingPrice);
        orderItem.setQuantity(orderItem.getQuantity() - newItem.getQuantity());
        additionalItems.add(newItem);
    }

    private int searchNextStock(OrderItem orderItem, int requiredQuantity, List<Storage> storages) {
        for (Storage storage : storages) {
            if (0 < requiredQuantity) {
                List<StockItem> availableStock = storage.getCommodities()
                        .stream().filter(stockItem -> stockItem.getProduct().getId() == orderItem.getProduct().getId())
                        .collect(Collectors.toList());

                if (0 < availableStock.size()) {
                    int stockSize = availableStock.size();
                    int stockIndex = 0;
                    while (0 < requiredQuantity && stockIndex < stockSize) {
                        StockItem availableStockItem = availableStock.get(stockIndex);
                        int availableQuantity = availableStockItem.getQuantity();

                        requiredQuantity = serveOrderItem(orderItem, requiredQuantity, availableStockItem, availableQuantity);
                        deleteStockItemIfSoldOut(availableStockItem);

                        stockIndex++;
                    }
                }
            }

        }
        return requiredQuantity * -1;
    }

    private int serveOrderItem(OrderItem orderItem, int requiredQuantity, StockItem availableStockItem, int availableQuantity) {
        if (requiredQuantity <= availableQuantity) {
            availableStockItem.setQuantity(availableQuantity - requiredQuantity);
            orderItem.setBuyingPrice(availableStockItem.getBuyingPrice());
            requiredQuantity = 0;
        } else {
            requiredQuantity = requiredQuantity - availableQuantity;
            availableStockItem.setQuantity(0);
        }
        return requiredQuantity;
    }

    private void deleteStockItemIfSoldOut(StockItem availableStockItem) {
        if (0 == availableStockItem.getQuantity()) {
            Storage removeFrom = WarehouseManager.getWarehouseManager().getStorageManagement().get(availableStockItem.getStorageId());
            removeFrom.deleteCommodity(availableStockItem.getId());
        }
    }
}
