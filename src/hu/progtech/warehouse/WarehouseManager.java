package hu.progtech.warehouse;

import hu.progtech.warehouse.management.Management;

public class WarehouseManager {
    private final Management<?> storageManagement;
    private final Management<?> productManagement;
    private final Management<?> orderManagement;
    private final Management<?> partnerManagement;

    public WarehouseManager (Management<?> storageManagement, Management<?> productManagement,
                             Management<?> orderManagement, Management<?> partnerManagement) {
        this.storageManagement = storageManagement;
        this.productManagement = productManagement;
        this.orderManagement = orderManagement;
        this.partnerManagement = partnerManagement;
    }

    public Management<?> getStockHandler() {
        return storageManagement;
    }

    public Management<?> getProductManagement() {
        return productManagement;
    }

    public Management<?> getOrderManagement() {
        return orderManagement;
    }

    public Management<?> getPartnerManagement() {
        return partnerManagement;
    }
}
