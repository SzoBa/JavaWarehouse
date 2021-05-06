package hu.progtech.warehouse.order;

import hu.progtech.warehouse.factory.GenericFactory;

public class OrderFactory implements GenericFactory<Order, OrderType> {

    public OrderFactory() {
    }


    @Override
    public Order create(OrderType type) {
        return null;
    }
}
