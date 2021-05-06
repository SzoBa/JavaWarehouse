package hu.progtech.warehouse.storage;

import hu.progtech.warehouse.factory.ItemFactory;
import hu.progtech.warehouse.product.Product;

public class StockItemFactory implements ItemFactory<StockItem> {

    public StockItemFactory() {
    }

    @Override
    public StockItem create(Product product) {
        return null;
    }
}
