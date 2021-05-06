package hu.progtech.warehouse.order;

import hu.progtech.warehouse.partner.Payable;

public class CustomerOrder extends Order{

    public CustomerOrder(int orderId) {
        super(orderId);
    }

    @Override
    Payable createPayable() {
        return null;
    }

    @Override
    void updateStock() {

    }
}
