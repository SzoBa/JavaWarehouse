package hu.progtech.warehouse.product;

public class Beverage extends Product{

    public Beverage(int id) {
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
