package hu.progtech.warehouse.management;

import hu.progtech.warehouse.order.Order;
import java.util.ArrayList;
import java.util.List;

public class OrderManagement implements Management<Order> {
    private final List<Order> orders = new ArrayList<>();

    @Override
    public void add(Order obj) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Order get(int id) {
        return null;
    }

    @Override
    public List<Order> getAll() {
        return this.orders;
    }
}
