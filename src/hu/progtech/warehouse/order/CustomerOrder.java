package hu.progtech.warehouse.order;

import hu.progtech.warehouse.partner.Payable;

import java.math.BigDecimal;

/** Order child class, to represent customer orders */
public class CustomerOrder extends Order{

    public CustomerOrder(int orderId) {
        super(orderId);
    }

    /** Creates a Payable that will be paid to us (positive value) */
    @Override
    Payable createPayable() {
        Payable newInvoice  = new Payable(this);
        BigDecimal invoiceValue = this.getItems().stream()
                .reduce(new BigDecimal(0), (a, b) -> a.add(b.getSellingPrice()), BigDecimal::add);
        newInvoice.setValue(invoiceValue);
        return newInvoice;
    }

    @Override
    void updateStock() {
        this.getItems().forEach(orderItem -> {

        });
    }
}
