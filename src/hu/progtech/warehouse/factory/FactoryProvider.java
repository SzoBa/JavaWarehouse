package hu.progtech.warehouse.factory;

import hu.progtech.warehouse.order.OrderFactory;
import hu.progtech.warehouse.partner.PartnerFactory;
import hu.progtech.warehouse.product.ProductFactory;
import hu.progtech.warehouse.storage.StorageFactory;

public class FactoryProvider {

    public FactoryProvider() {
    }

    /** It requires a FactoryType and then returns a factory class for the corresponding module */
    public GenericFactory<?, ?> getFactory(FactoryType type) {
        switch (type) {
            case ORDER:
                return new OrderFactory();
            case PARTNER:
                return new PartnerFactory();
            case PRODUCT:
                return new ProductFactory();
            case STORAGE:
                return new StorageFactory();
            default:
                return null;
        }
    }
}
