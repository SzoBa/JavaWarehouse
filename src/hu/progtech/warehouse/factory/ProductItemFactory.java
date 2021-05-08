package hu.progtech.warehouse.factory;

import hu.progtech.warehouse.product.Product;

/**
 * Elemek létrehozását deklarálja, egy elemtípust és egy Product osztálypéldányt kérve argumentumként.
 * A programban használt Item példányok létrehozásának feltétele egy Product példány (másolat) biztosítása.
 */
/**
 * It declares the creation of items, requesting an item type and a Product class instance as arguments.
 * The condition, for creating Item instances used in the program, is to provide a Product instance (clone).
 */
public interface ProductItemFactory {

    Item createItem(ItemType item, Product product);

}
