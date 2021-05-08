package hu.progtech.warehouse.order;

import hu.progtech.warehouse.partner.Partner;
import hu.progtech.warehouse.partner.Payable;

import java.util.ArrayList;
import java.util.List;

/**
 *  A rendelésekkel kapcsolatos inormációkat, és tételeket tartalmazza.
 *  A createPayable (számla/fizetendő reprezentálására való a Payable osztály),
 *  az updateStock (készlet módosítása) absztrakt metódusokat deklarálja.
 */
/**
 * Contains order information and items.
 * It declares the createPayable (invoice / payable representation, the Payable class),
 * updateStock (change storage item quantities) abstract methods.
 */
public abstract class Order {

    private final int orderId;
    private Partner partner;
    private boolean isFulfilled;
    private final List<OrderItem> items = new ArrayList<>();

    public Order(int orderId) {
        this.orderId = orderId;
    }

    void addItem(OrderItem orderItem) {

    }

    void removeItem(int itemId) {

    }

    /**
     * Rendelés lezártnak jelölése. Lényegében setter, de komplexebb logika implemetálására használható majd bővítéskor.
     */
    /**
     * Mark order as finalized. Essentially a setter, but it can be used to implement more complex logic.
     */
    public void fulfillOrder() {

    }
    abstract Payable createPayable();
    abstract void updateStock();


    public int getOrderId() {
        return orderId;
    }

    public Partner getPartner() {
        return partner;
    }

    public boolean isFulfilled() {
        return isFulfilled;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setPartner(Partner partner) {
        this.partner = partner;
    }

    public void setFulfilled(boolean fulfilled) {
        isFulfilled = fulfilled;
    }
}
