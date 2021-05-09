package hu.progtech.warehouse.product;

/** An instantiatable child class of the Product abstract class. It is used to represent product types. */
public class Electronics extends Product{


    public Electronics(int id, ProductType productType) {
        super(id, productType);
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
