package hu.progtech.warehouse.product;

import hu.progtech.warehouse.factory.GenericFactory;

/**
 * A GenericFactory interfészt implementálja.
 * Ő példányosítja a Product gyermekosztályokat.
 */
/**
 * Implements the GenericFactory interface.
 * It instantiates the Product child classes.
 */
public class ProductFactory implements GenericFactory<Product, ProductType> {

    public ProductFactory() {
    }

    @Override
    public Product create(ProductType type) {
        return null;
    }

}
