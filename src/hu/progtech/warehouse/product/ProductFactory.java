package hu.progtech.warehouse.product;

import hu.progtech.warehouse.factory.AbstractFactory;

public class ProductFactory implements AbstractFactory<Product, ProductType> {

    @Override
    public Product create(ProductType type) {
        return null;
    }
}
