package hu.progtech.warehouse.partner;

public class Customer extends Partner{
    private SalesPerson salesRepresentative;

    public Customer(int id) {
        super(id);
    }

    public Customer(int id, SalesPerson salesRepresentative) {
        super(id);
        this.salesRepresentative = salesRepresentative;
    }

    @Override
    public String getContactPerson() {
        return null;
    }

    public void setSalesRepresentative(SalesPerson salesRepresentative) {
        this.salesRepresentative = salesRepresentative;
    }
}
