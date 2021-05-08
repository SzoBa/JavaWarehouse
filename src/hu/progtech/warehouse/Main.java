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

        /**
         * A WarehouseManager osztály és az általa használt egységek példánybeállítása a program indításakor.
         */
        /**
         * Configure the instance of the WarehouseManager class and the units it uses at starting the program.
         */
        WarehouseManager warehouseManager = new WarehouseManager(new StorageManagement(), new ProductManagement(),
                new OrderManagement(), new PartnerManagement(),
                new ProductCloneProvider(), new FactoryProvider());
        /** A létrehozott warehouse példány beállítása, hogy mindenhol elérhető legyen */
        /** Set the WarehouseManager instance to be available everywhere */
        WarehouseManager.setWarehouseManager(warehouseManager);
    }
}
