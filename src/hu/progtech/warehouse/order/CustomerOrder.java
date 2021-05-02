package hu.progtech.warehouse.order;

import hu.progtech.warehouse.partner.Partner;

public class CustomerOrder extends Order {

    public CustomerOrder(int id, Partner partner) {
        super(id, partner);
    }

    @Override
    public void updateStock() {

    }

    @Override
    void addPayable() {

    }
}
