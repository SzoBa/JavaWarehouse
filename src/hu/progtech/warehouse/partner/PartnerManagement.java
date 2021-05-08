package hu.progtech.warehouse.partner;

import hu.progtech.warehouse.Management;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/** Implements the Management interface. Contains Partner instances in a list */
public class PartnerManagement implements Management<Partner> {

    private final List<Partner> partners = new ArrayList<>();

    public PartnerManagement() {
    }

    @Override
    public void add(Partner partner) {
        partners.add(partner);
    }

    @Override
    public void delete(int partnerId) {
        Optional<Partner> removable = partners.stream().filter(partner -> partner.getId() == partnerId).findFirst();
        if (removable.isPresent()) {
            partners.remove(removable.get());
        } else {
            System.out.println("Invalid partner id!");
        }
    }

    @Override
    public Partner get(int partnerId) {
        return partners.stream().filter(partner -> partner.getId() == partnerId).findFirst().orElse(null);
    }

    @Override
    public List<Partner> getAll() {
        return partners;
    }
}
