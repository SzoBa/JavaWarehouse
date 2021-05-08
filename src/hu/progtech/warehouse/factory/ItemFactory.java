package hu.progtech.warehouse.factory;

import hu.progtech.warehouse.product.Product;

/** Ezt az interfészt példányosítják a gyárak, amik az Item absztrakt osztály gyermekosztályaival térnek vissza */
/** This interface is instantiated by the factories that return with the child classes of the Item abstract class */
public interface ItemFactory<T> {

    T create(Product product);
}
