package hu.progtech.warehouse.order;

import hu.progtech.warehouse.WarehouseManager;
import hu.progtech.warehouse.factory.ItemType;
import hu.progtech.warehouse.partner.Payable;
import hu.progtech.warehouse.storage.StockItem;
import hu.progtech.warehouse.storage.Storage;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

/** Order child class, to represent supplier orders */
public class SupplierOrder extends Order{

    public SupplierOrder(int orderId) {
        super(orderId);
    }

    /** Creates a Payable that we have to pay (negative value) */
    @Override
    Payable createPayable() {
        Payable newInvoice  = new Payable(this);
        BigDecimal invoiceValue = this.getItems().stream()
                .reduce(new BigDecimal(0), (a, b) -> a.add(b.getSellingPrice()), BigDecimal::add);
        newInvoice.setValue(new BigDecimal(0).subtract(invoiceValue));
        return newInvoice;
    }

    /** Add StockItems to Storages. In the case of a supplier order, this corresponds to stockpiling. */
    @Override
    void updateStock() {
        this.getItems().forEach(item -> {
            StockItem stockItem = (StockItem) WarehouseManager.getWarehouseManager().getItemProvider()
                    .createItem(ItemType.STOCK_ITEM, item.getProduct());
            stockItem.setQuantity(item.getQuantity());
            stockItem.setBuyingPrice(item.getBuyingPrice());
            //TODO: set expiration date of item from external info, or in storage module
            //TODO: add possibility to manually set the target storage
            //TODO: handle suitable storage problem
            List<Storage> storages = WarehouseManager.getWarehouseManager().getStorageManagement().getAll();
            Optional<Storage> suitableStorage = storages.stream()
                    .filter(storage -> storage.getAllowedCommodities().contains(stockItem.getProduct().getProductType()))
                    .findFirst();
            if (suitableStorage.isPresent()) {
                suitableStorage.get().addCommodity(stockItem);
            } else {
                System.out.println("Item " + stockItem.getClass().getSimpleName() + " requires suitable storage!");
            }
        }
        );
    }


}
