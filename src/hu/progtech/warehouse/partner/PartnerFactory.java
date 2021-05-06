package hu.progtech.warehouse.partner;

import hu.progtech.warehouse.factory.GenericFactory;

public class PartnerFactory implements GenericFactory<Partner, PartnerType> {

    public PartnerFactory() {
    }

    @Override
    public Partner create(PartnerType type) {
        return null;
    }

}
