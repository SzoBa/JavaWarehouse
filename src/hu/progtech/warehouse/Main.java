package hu.progtech.warehouse;

import hu.progtech.warehouse.factory.FactoryProvider;
import hu.progtech.warehouse.factory.ProductCloneFactory;
import hu.progtech.warehouse.order.OrderManagement;
import hu.progtech.warehouse.partner.PartnerManagement;
import hu.progtech.warehouse.product.ProductManagement;
import hu.progtech.warehouse.storage.StorageManagement;

public class Main {

    public static void main(String[] args) {
        WarehouseManager warehouseManager = new WarehouseManager(new StorageManagement(), new ProductManagement(),
                new OrderManagement(), new PartnerManagement(),
                new ProductCloneFactory(), new FactoryProvider());
    }
}
