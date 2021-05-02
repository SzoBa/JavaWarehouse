package hu.progtech.warehouse;


import hu.progtech.warehouse.management.OrderManagement;
import hu.progtech.warehouse.management.PartnerManagement;
import hu.progtech.warehouse.management.ProductManagement;
import hu.progtech.warehouse.management.StorageManagement;

public class Main {
    public static void main(String[] args) {
        WarehouseManager warehouse = new WarehouseManager(new StorageManagement(),
                new ProductManagement(), new OrderManagement(), new PartnerManagement());

    }
}
