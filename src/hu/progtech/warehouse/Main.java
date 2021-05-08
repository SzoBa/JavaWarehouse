package hu.progtech.warehouse;

import hu.progtech.warehouse.factory.FactoryProvider;
import hu.progtech.warehouse.factory.ProductCloneProvider;
import hu.progtech.warehouse.order.OrderManagement;
import hu.progtech.warehouse.partner.PartnerManagement;
import hu.progtech.warehouse.product.ProductManagement;
import hu.progtech.warehouse.storage.StorageManagement;

public class Main {

    /** A WarehouseManager osztálypéldánya (mezői, azaz a programegységek), mindenki számára hozzáférhető a programban */
    /** The WarehouseManager class' instance (it's fields, ie the program units), is accessible to everyone in the program. */
    public static WarehouseManager warehouseManager;

    /** A program belépési pontja */
    /** The application's entry point*/
    public static void main(String[] args) {
        Main.warehouseManager = new WarehouseManager(new StorageManagement(), new ProductManagement(),
                new OrderManagement(), new PartnerManagement(),
                new ProductCloneProvider(), new FactoryProvider());
    }
}
