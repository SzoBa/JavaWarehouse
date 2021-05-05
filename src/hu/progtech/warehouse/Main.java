package hu.progtech.warehouse;


import hu.progtech.warehouse.management.OrderManagement;
import hu.progtech.warehouse.management.PartnerManagement;
import hu.progtech.warehouse.management.ProductManagement;
import hu.progtech.warehouse.management.StorageManagement;

public class Main {

    private static WarehouseManager warehouse;

    public static void main(String[] args) {
        Main.warehouse = new WarehouseManager(new StorageManagement(),
                new ProductManagement(), new OrderManagement(), new PartnerManagement());
    }

    public static WarehouseManager getWarehouse() {
        return warehouse;
    }
}
