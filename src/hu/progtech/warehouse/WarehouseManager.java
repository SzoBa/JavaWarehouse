package hu.progtech.warehouse;

import hu.progtech.warehouse.factory.FactoryProvider;
import hu.progtech.warehouse.factory.ProductItemFactory;
import hu.progtech.warehouse.order.OrderManagement;
import hu.progtech.warehouse.partner.PartnerManagement;
import hu.progtech.warehouse.product.ProductManagement;
import hu.progtech.warehouse.storage.StorageManagement;

public class WarehouseManager {
    private final StorageManagement storageManagement;
    private final ProductManagement productManagement;
    private final OrderManagement orderManagement;
    private final PartnerManagement partnerManagement;
    private final ProductItemFactory<?> itemProvider;
    private final FactoryProvider factoryProvider;

    public WarehouseManager(StorageManagement storageManagement, ProductManagement productManagement,
                            OrderManagement orderManagement, PartnerManagement partnerManagement,
                            ProductItemFactory<?> itemProvider, FactoryProvider factoryProvider) {
        this.storageManagement = storageManagement;
        this.productManagement = productManagement;
        this.orderManagement = orderManagement;
        this.partnerManagement = partnerManagement;
        this.itemProvider = itemProvider;
        this.factoryProvider = factoryProvider;
    }

    public StorageManagement getStorageManagement() {
        return storageManagement;
    }

    public ProductManagement getProductManagement() {
        return productManagement;
    }

    public OrderManagement getOrderManagement() {
        return orderManagement;
    }

    public PartnerManagement getPartnerManagement() {
        return partnerManagement;
    }

    public ProductItemFactory<?> getItemProvider() {
        return itemProvider;
    }

    public FactoryProvider getFactoryProvider() {
        return factoryProvider;
    }
}
