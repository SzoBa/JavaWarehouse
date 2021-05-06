package hu.progtech.warehouse.product;

public class Clothing extends Product{

    public Clothing(int id) {
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
