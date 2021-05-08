package hu.progtech.warehouse.partner;

/** A Partner gyermekosztálya, beszállítót reprezentál. Beszerző tartozhat hozzá. */
/** The child class of Partner, represents a supplier. Buyer may belong to it. */
public class Supplier extends Partner{

    private String buyerContact;

    public Supplier(int id) {
        super(id);
    }

    @Override
    public String getContactPerson() {
        return buyerContact;
    }

    @Override
    public void setContactPerson() {

    }
}
