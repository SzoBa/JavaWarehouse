package hu.progtech.warehouse;

import hu.progtech.warehouse.factory.FactoryProvider;
import hu.progtech.warehouse.factory.ProductCloneProvider;
import hu.progtech.warehouse.order.OrderManagement;
import hu.progtech.warehouse.partner.PartnerManagement;
import hu.progtech.warehouse.product.ProductManagement;
import hu.progtech.warehouse.storage.StorageManagement;

public class Main {

    /** A program belépési pontja */
    /** The application's entry point*/
    public static void main(String[] args) {
        WarehouseManager warehouseManager = new WarehouseManager(new StorageManagement(), new ProductManagement(),
                new OrderManagement(), new PartnerManagement(),
                new ProductCloneProvider(), new FactoryProvider());
    }
}
