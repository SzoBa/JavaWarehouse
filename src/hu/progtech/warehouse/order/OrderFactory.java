package hu.progtech.warehouse.order;

import hu.progtech.warehouse.IdGenerator;
import hu.progtech.warehouse.factory.GenericFactory;

/**
 * Implements the GenericFactory interface.
 * It instantiates the Order child classes.
 */
public class OrderFactory implements GenericFactory<Order, OrderType> {

    public OrderFactory() {
    }


    @Override
    public Order create(OrderType type) {
        int id = IdGenerator.getNewId();
        switch (type) {
            case SUPPLIER:
                return new SupplierOrder(id);
            case CUSTOMER:
                return new CustomerOrder(id);
            default:
                return null;
        }
    }
}
