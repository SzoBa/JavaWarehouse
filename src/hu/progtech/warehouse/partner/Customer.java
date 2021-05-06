package hu.progtech.warehouse.partner;

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
    public void setContactPerson() {

    }

}
