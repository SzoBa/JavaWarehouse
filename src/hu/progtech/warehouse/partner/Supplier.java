package hu.progtech.warehouse.partner;

public class Supplier extends Partner{

    private String buyerContact;

    public Supplier(int id) {
        super(id);
    }

    @Override
    public String getContactPerson() {
        return buyerContact;
    }

    public String getBuyerContact() {
        return buyerContact;
    }

    public void setBuyerContact(String buyerContact) {
        this.buyerContact = buyerContact;
    }
}
