package hu.progtech.warehouse.order;

import hu.progtech.warehouse.partner.Partner;

public class SupplierOrder extends Order {

    public SupplierOrder(int id, Partner partner) {
        super(id, partner);
    }

    @Override
    public void updateStock() {

    }

    @Override
    void addPayable() {

    }
}
