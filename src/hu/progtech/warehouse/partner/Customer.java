package hu.progtech.warehouse.partner;

/** The child class of Partner, represents a customer. It may have a salesperson. */
public class Customer extends Partner{

    private String salesRepresentative;

    public Customer(int id) {
        super(id);
    }

    @Override
    public String getContactPerson() {
        return salesRepresentative;
    }

    @Override
    public void setContactPerson(String name) {
        this.salesRepresentative = name;
    }

}
