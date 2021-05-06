package hu.progtech.warehouse.product;

public class Medication extends Product{

    public Medication(int id) {
        super(id);
    }

    @Override
    public Product clone() {
        try {
            return super.superClone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError();
        }
    }

}
