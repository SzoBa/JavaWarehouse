package hu.progtech.warehouse.order;

import hu.progtech.warehouse.partner.Payable;
/** Order gyermekosztály, a vevői rendelések reprezentálására */
/** Order child class, to represent customer orders */
public class CustomerOrder extends Order{

    public CustomerOrder(int orderId) {
        super(orderId);
    }

    /** Olyan Payable-t készít, ami nekünk fizetnek (pozitív értékű) */
    /** Creates a Payable that will be paid to us (positive value) */
    @Override
    Payable createPayable() {
        return null;
    }

    @Override
    void updateStock() {

    }
}
