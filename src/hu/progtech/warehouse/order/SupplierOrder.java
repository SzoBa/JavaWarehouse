package hu.progtech.warehouse.order;

import hu.progtech.warehouse.partner.Payable;

public class SupplierOrder extends Order{

    public SupplierOrder(int orderId) {
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
