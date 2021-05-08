package hu.progtech.warehouse.partner;

import hu.progtech.warehouse.Management;
import hu.progtech.warehouse.order.Order;

import java.util.ArrayList;
import java.util.List;

/** Implementálja a Management interfészt. Listában tartalmazza a Partner példányokat */
/** Implements the Management interface. Contains Partner instances in a list */
public class PartnerManagement implements Management<Partner> {

    private final List<Partner> partners = new ArrayList<>();

    public PartnerManagement() {
    }

    @Override
    public void add(Partner partner) {

    }

    @Override
    public void delete(int partnerId) {

    }

    @Override
    public Partner get(int partnerId) {
        return null;
    }

    @Override
    public List<Partner> getAll() {
        return partners;
    }
}
