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
    private final ProductItemFactory itemProvider;
    private final FactoryProvider factoryProvider;
    private static WarehouseManager warehouseManager;

    /** Ez az osztály biztosítja a gyár és Management osztályok példányait, amik mindenki számára elérhetőek */
    /** This class provides the instances of Management classes and factory classes, accessible by everyone */
    protected WarehouseManager(Management<Storage> storageManagement, Management<Product> productManagement,
                            Management<Order> orderManagement, Management<Partner> partnerManagement,
                            ProductItemFactory itemProvider, FactoryProvider factoryProvider) {
        this.storageManagement = storageManagement;
        this.productManagement = productManagement;
        this.orderManagement = orderManagement;
        this.partnerManagement = partnerManagement;
        this.itemProvider = itemProvider;
        this.factoryProvider = factoryProvider;
    }

    /** A WarehouseManager osztálypéldány beállítását nem érik el az almodulok, de magát a példányt le tudják kérni */
    /** SubPackages cannot set WarehouseManager instance, but can retrieve the instance itself */
    protected static void setWarehouseManager(WarehouseManager warehouseManager) {
        WarehouseManager.warehouseManager = warehouseManager;
    }


    public static WarehouseManager getWarehouseManager() {
        return WarehouseManager.warehouseManager;
    }

    public Management<Storage> getStorageManagement() {
        return this.storageManagement;
    }

    public Management<Product> getProductManagement() {
        return this.productManagement;
    }

    public Management<Order> getOrderManagement() {
        return this.orderManagement;
    }

    public Management<Partner> getPartnerManagement() {
        return this.partnerManagement;
    }

    public ProductItemFactory getItemProvider() {
        return this.itemProvider;
    }

    public FactoryProvider getFactoryProvider() {
        return this.factoryProvider;
    }

}
