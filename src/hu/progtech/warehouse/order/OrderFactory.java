package hu.progtech.warehouse.order;

import hu.progtech.warehouse.factory.GenericFactory;

/**
 * A GenericFactory interfészt implementálja.
 * Ő példányosítja az Order gyermekosztályokat.
 */
/**
 * Implements the GenericFactory interface.
 * It instantiates the Order child classes.
 */
public class OrderFactory implements GenericFactory<Order, OrderType> {

    public OrderFactory() {
    }


    @Override
    public Order create(OrderType type) {
        return null;
    }
}
