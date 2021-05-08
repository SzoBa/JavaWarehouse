package hu.progtech.warehouse.product;

import hu.progtech.warehouse.IdGenerator;
import hu.progtech.warehouse.factory.GenericFactory;

/**
 * Implements the GenericFactory interface.
 * It instantiates the Product child classes.
 */
public class ProductFactory implements GenericFactory<Product, ProductType> {

    public ProductFactory() {
    }

    @Override
    public Product create(ProductType type) {
        int id = IdGenerator.getNewId();
        switch (type) {
            case BEVERAGE:
                return new Beverage(id);
            case CANDY:
                return new Candy(id);
            case CLOTHING:
                return new Clothing(id);
            case ELECTRONICS:
                return new Electronics(id);
            case MEDICATION:
                return new Medication(id);
            case TOILETRY:
                return new Toiletry(id);
            default:
                return null;
        }
    }

}
