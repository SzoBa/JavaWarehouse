package hu.progtech.warehouse.order;

import hu.progtech.warehouse.factory.ItemFactory;
import hu.progtech.warehouse.product.Product;

/**
 * Az ItemFactory interfészt implementálja.
 * Ő példányosítja az OrderItem példányokat.
 */
/**
 * Implements the ItemFactory interface.
 * It instantiates the OrderItem instances.
 */
public class OrderItemFactory implements ItemFactory<OrderItem> {

    public OrderItemFactory() {
    }

    @Override
    public OrderItem create(Product product) {
        return null;
    }

}
