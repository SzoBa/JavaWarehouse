package hu.progtech.warehouse.partner;

import hu.progtech.warehouse.IdGenerator;
import hu.progtech.warehouse.factory.GenericFactory;

/**
 * Implements the GenericFactory interface.
 * It instantiates the Partner child classes.
 */
public class PartnerFactory implements GenericFactory<Partner, PartnerType> {

    public PartnerFactory() {
    }

    @Override
    public Partner create(PartnerType type) {
        int id = IdGenerator.getNewId();
        switch (type) {
            case CUSTOMER:
                return new Customer(id);
            case SUPPLIER:
                return new Supplier(id);
            default:
                return null;
        }
    }

}
