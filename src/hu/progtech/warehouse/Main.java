package hu.progtech.warehouse;

import hu.progtech.warehouse.factory.FactoryProvider;
import hu.progtech.warehouse.factory.ProductCloneProvider;
import hu.progtech.warehouse.order.OrderManagement;
import hu.progtech.warehouse.partner.PartnerManagement;
import hu.progtech.warehouse.product.ProductManagement;
import hu.progtech.warehouse.storage.StorageManagement;

public class Main {

    /** The application's entry point*/
    public static void main(String[] args) {

        /**
         * Configure the instance of the WarehouseManager class and the units it uses at starting the program.
         */
        WarehouseManager warehouseManager = new WarehouseManager(new StorageManagement(), new ProductManagement(),
                new OrderManagement(), new PartnerManagement(),
                new ProductCloneProvider(), new FactoryProvider());
        /** Set the WarehouseManager instance to be available everywhere */
        WarehouseManager.setWarehouseManager(warehouseManager);
    }
}
