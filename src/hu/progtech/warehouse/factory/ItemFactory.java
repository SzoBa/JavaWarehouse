package hu.progtech.warehouse.factory;

import hu.progtech.warehouse.product.Product;

/** Rajta keresztül érhetőek el az Item absztrakt osztály gyermekosztályai példányosításhoz */
/** The child classes of the Item abstract class can be accessed for instantiation through it*/
public interface ItemFactory<T> {

    T create(Product product);
}
