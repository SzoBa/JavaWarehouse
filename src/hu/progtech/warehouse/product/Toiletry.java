package hu.progtech.warehouse.product;

/** A Product absztakt osztály példányosítható gyermekosztálya. A termékfajták reprezentálására szolgál. */
/** An instantiatable child class of the Product abstract class. It is used to represent product types. */
public class Toiletry extends Product{

    public Toiletry(int id) {
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
