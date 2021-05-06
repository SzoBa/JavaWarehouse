package hu.progtech.warehouse.order;

import hu.progtech.warehouse.factory.AbstractFactory;

public class OrderFactory implements AbstractFactory<Order, OrderType> {

    public OrderFactory() {
    }


    @Override
    public Order create(OrderType type) {
        return null;
    }
}
