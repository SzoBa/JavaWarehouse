package hu.progtech.warehouse.product;

import hu.progtech.warehouse.factory.GenericFactory;

public class ProductFactory implements GenericFactory<Product, ProductType> {

    public ProductFactory() {
    }

    @Override
    public Product create(ProductType type) {
        return null;
    }

}
