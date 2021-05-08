package hu.progtech.warehouse.storage;

import hu.progtech.warehouse.factory.ItemFactory;
import hu.progtech.warehouse.product.Product;

/**
 * Az ItemFactory interfészt implementálja.
 * Ő példányosítja a StockItem példányokat.
 */
/**
 * Implements the ItemFactory interface.
 * It instantiates the StockItem instances.
 */
public class StockItemFactory implements ItemFactory<StockItem> {

    public StockItemFactory() {
    }

    @Override
    public StockItem create(Product product) {
        return null;
    }
}
