package hu.progtech.warehouse.partner;

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
    public void setContactPerson(String name) {
        this.buyerContact = name;
    }
}
