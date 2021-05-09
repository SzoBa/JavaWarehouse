package hu.progtech.warehouse.order;

import hu.progtech.warehouse.IdGenerator;
import hu.progtech.warehouse.factory.ItemFactory;
import hu.progtech.warehouse.product.Product;

/**
 * Implements the ItemFactory interface.
 * It instantiates the OrderItem classes.
 */
public class OrderItemFactory implements ItemFactory<OrderItem> {

    public OrderItemFactory() {
    }

    @Override
    public OrderItem create(Product product) {
        int id = IdGenerator.getNewId();
        return new OrderItem(id, product);
    }

}
