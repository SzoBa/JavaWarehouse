package hu.progtech.warehouse.factory;

import hu.progtech.warehouse.product.Product;

/**
 * Ez az osztály implementálja a ProductItemFactory-t.
 * Használja az ItemType enum-ot, és az ItemFactory interfészt implementáló osztályokat.
 */
/**
 * This class implements the ProductItemFactory interface.
 * It uses the ItemType enum and the classes that implement the ItemFactory interface.
 */
public class ProductCloneProvider implements ProductItemFactory {

    public ProductCloneProvider() {
    }

    /** A megadott Product példány clone metódusát meghívva, annak másolatát biztosítja. */
    /** It calls the clone method of the specified Product instance to provide a clone of it. */
    Product makeCopy(Product originalProduct) {
        return originalProduct;
    }

    @Override
    public Item createItem(ItemType item, Product product) {
        return null;
    }

}
