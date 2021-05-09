package hu.progtech.warehouse.order;

import hu.progtech.warehouse.Management;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/** Implements the Management interface. Contains Order instances in a list */
public class OrderManagement implements Management<Order> {

    private final List<Order> orders = new ArrayList<>();

    public OrderManagement() {
    }

    @Override
    public void add(Order order) {
        orders.add(order);
    }

    @Override
    public void delete(int orderId) {
        Optional<Order> removable = orders.stream().filter(order -> order.getOrderId() == orderId).findFirst();
        if (removable.isPresent()) {
            orders.remove(removable.get());
        } else {
            System.out.println("Invalid order id!");
        }
    }

    @Override
    public Order get(int orderId) {
        return orders.stream().filter(order -> order.getOrderId() == orderId).findFirst().orElse(null);
    }

    @Override
    public List<Order> getAll() {
        return orders;
    }
}
