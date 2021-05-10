package hu.progtech.warehouse.factory;

import hu.progtech.warehouse.order.OrderItemFactory;
import hu.progtech.warehouse.product.Product;
import hu.progtech.warehouse.storage.StockItemFactory;

/**
 * This class implements the ProductItemFactory interface.
 * It uses the ItemType enum and the classes that implement the ItemFactory interface.
 */
public class ProductCloneProvider implements ProductItemFactory {

    public ProductCloneProvider() {
    }

    /** It calls the clone method of the specified Product instance to provide a clone of it. */
    Product makeCopy(Product originalProduct) {
        return originalProduct.clone();
    }

    @Override
    public Item createItem(ItemType item, Product product) {
        Product clone = makeCopy(product);
        switch (item) {
            case ORDER_ITEM:
                return new OrderItemFactory().create(clone);
            case STOCK_ITEM:
                return new StockItemFactory().create(clone);
            default:
                return null;
        }
    }

}
