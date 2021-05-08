package hu.progtech.warehouse.storage;

import hu.progtech.warehouse.IdGenerator;
import hu.progtech.warehouse.factory.ItemFactory;
import hu.progtech.warehouse.product.Product;

/**
 * Implements the ItemFactory interface.
 * It instantiates the StockItem instances.
 */
public class StockItemFactory implements ItemFactory<StockItem> {

    public StockItemFactory() {
    }

    @Override
    public StockItem create(Product product) {
        int id = IdGenerator.getNewId();
        return new StockItem(id, product);
    }
}
