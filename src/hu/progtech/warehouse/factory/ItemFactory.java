package hu.progtech.warehouse.factory;

import hu.progtech.warehouse.product.Product;

public interface ItemFactory<T> {

    T create(Product product);
}
