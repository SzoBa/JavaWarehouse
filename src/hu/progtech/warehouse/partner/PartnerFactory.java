package hu.progtech.warehouse.partner;

import hu.progtech.warehouse.factory.GenericFactory;

/**
 * A GenericFactory interfészt implementálja.
 * Ő példányosítja a Partner gyermekosztályokat.
 */
/**
 * Implements the GenericFactory interface.
 * It instantiates the Partner child classes.
 */
public class PartnerFactory implements GenericFactory<Partner, PartnerType> {

    public PartnerFactory() {
    }

    @Override
    public Partner create(PartnerType type) {
        return null;
    }

}
