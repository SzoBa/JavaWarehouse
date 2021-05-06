package hu.progtech.warehouse;

import hu.progtech.warehouse.factory.FactoryProvider;
import hu.progtech.warehouse.factory.ProductItemFactory;
import hu.progtech.warehouse.order.Order;
import hu.progtech.warehouse.partner.Partner;
import hu.progtech.warehouse.product.Product;
import hu.progtech.warehouse.storage.Storage;

public class WarehouseManager {
    private final Management<Storage> storageManagement;
    private final Management<Product> productManagement;
    private final Management<Order> orderManagement;
    private final Management<Partner> partnerManagement;
    private final ProductItemFactory<Product> itemProvider;
    private final FactoryProvider factoryProvider;

    public WarehouseManager(Management<Storage> storageManagement, Management<Product> productManagement,
                            Management<Order> orderManagement, Management<Partner> partnerManagement,
                            ProductItemFactory<Product> itemProvider, FactoryProvider factoryProvider) {
        this.storageManagement = storageManagement;
        this.productManagement = productManagement;
        this.orderManagement = orderManagement;
        this.partnerManagement = partnerManagement;
        this.itemProvider = itemProvider;
        this.factoryProvider = factoryProvider;
    }

    public Management<Storage> getStorageManagement() {
        return storageManagement;
    }

    public Management<Product> getProductManagement() {
        return productManagement;
    }

    public Management<Order> getOrderManagement() {
        return orderManagement;
    }

    public Management<Partner> getPartnerManagement() {
        return partnerManagement;
    }

    public ProductItemFactory<Product> getItemProvider() {
        return itemProvider;
    }

    public FactoryProvider getFactoryProvider() {
        return factoryProvider;
    }
}
