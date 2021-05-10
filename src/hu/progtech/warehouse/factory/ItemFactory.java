package hu.progtech.warehouse.factory;

import hu.progtech.warehouse.product.Product;

/** This interface is instantiated by the factories that return with the child classes of the Item abstract class */
public interface ItemFactory<T> {

    T create(Product product);
}
