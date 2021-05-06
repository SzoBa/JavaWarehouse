package hu.progtech.warehouse.product;

public class Candy extends Product{

    public Candy(int id) {
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
