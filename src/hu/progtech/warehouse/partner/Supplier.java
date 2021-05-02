package hu.progtech.warehouse.partner;

public class Supplier extends Partner{
    private Buyer buyerContact;

    public Supplier(int id) {
        super(id);
    }

    public Supplier(int id, Buyer buyerContact) {
        super(id);
        this.buyerContact = buyerContact;
    }

    @Override
    public String getContactPerson() {
        return null;
    }

    public void setBuyerContact(Buyer buyerContact) {
        this.buyerContact = buyerContact;
    }
}
