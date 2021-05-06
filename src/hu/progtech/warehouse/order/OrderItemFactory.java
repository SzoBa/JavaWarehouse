package hu.progtech.warehouse.order;

import hu.progtech.warehouse.factory.ItemFactory;
import hu.progtech.warehouse.product.Product;

public class OrderItemFactory implements ItemFactory<OrderItem> {

    @Override
    public OrderItem create(Product product) {
        return null;
    }
}
