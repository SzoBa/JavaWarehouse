package hu.progtech.warehouse.factory;

import hu.progtech.warehouse.product.Product;

public interface ProductItemFactory<T> {

    public T createItem(ItemType item, Product product);
}
