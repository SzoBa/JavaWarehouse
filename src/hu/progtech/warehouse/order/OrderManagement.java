package hu.progtech.warehouse.order;

import hu.progtech.warehouse.Management;
import hu.progtech.warehouse.product.Product;

import java.util.ArrayList;
import java.util.List;

public class OrderManagement implements Management<Order> {

    private final List<Order> orders = new ArrayList<>();

    @Override
    public void add(Order order) {

    }

    @Override
    public void delete(int orderId) {

    }

    @Override
    public Order get(int orderId) {
        return null;
    }

    @Override
    public List<Order> getAll() {
        return orders;
    }
}
