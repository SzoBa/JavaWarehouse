package hu.progtech.warehouse.product;

import hu.progtech.warehouse.factory.AbstractFactory;

public class ProductFactory implements AbstractFactory<Product, ProductType> {

    public ProductFactory() {
    }

    @Override
    public Product create(ProductType type) {
        return null;
    }

}
