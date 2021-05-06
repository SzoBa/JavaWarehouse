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

    public String getSalesRepresentative() {
        return salesRepresentative;
    }

    public void setSalesRepresentative(String salesRepresentative) {
        this.salesRepresentative = salesRepresentative;
    }
}
