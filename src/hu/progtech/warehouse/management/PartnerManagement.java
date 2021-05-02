package hu.progtech.warehouse.management;

import hu.progtech.warehouse.partner.Partner;
import java.util.ArrayList;
import java.util.List;

public class PartnerManagement implements Management<Partner> {
    private final List<Partner> partners = new ArrayList<>();

    @Override
    public void add(Partner obj) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Partner get(int id) {
        return null;
    }

    @Override
    public List<Partner> getAll() {
        return this.partners;
    }
}
