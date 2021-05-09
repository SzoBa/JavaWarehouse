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
                return new Beverage(id, type);
            case CANDY:
                return new Candy(id, type);
            case CLOTHING:
                return new Clothing(id, type);
            case ELECTRONICS:
                return new Electronics(id, type);
            case MEDICATION:
                return new Medication(id, type);
            case TOILETRY:
                return new Toiletry(id, type);
            default:
                return null;
        }
    }

}
