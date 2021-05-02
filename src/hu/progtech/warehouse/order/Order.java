package hu.progtech.warehouse.order;

import hu.progtech.warehouse.partner.Partner;

import java.util.ArrayList;
import java.util.List;

public abstract class Order {
    final int id;
    final Partner partner;
    boolean isFulfilled;
    final List<OrderItem> items = new ArrayList<>();


    public Order(int id, Partner partner) {
        this.id = id;
        this.partner = partner;
    }

    public void addItem(OrderItem item) {

    }

    public void removeItem(int id) {

    }

    public void markAsFulfilled() {
        this.isFulfilled = true;
        this.updateStock();
        this.addPayable();
    }

    abstract void updateStock();
    abstract void addPayable();

    public int getId() {
        return id;
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
}
