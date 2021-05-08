package hu.progtech.warehouse.product;

/** An instantiatable child class of the Product abstract class. It is used to represent product types. */
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
