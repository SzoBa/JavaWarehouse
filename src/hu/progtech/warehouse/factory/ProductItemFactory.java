package hu.progtech.warehouse.factory;

import hu.progtech.warehouse.product.Product;

public interface ProductItemFactory<T> {

    T createItem(ItemType item, Product product);
}
