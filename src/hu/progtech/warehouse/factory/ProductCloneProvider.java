package hu.progtech.warehouse.factory;

import hu.progtech.warehouse.product.Product;

public class ProductCloneProvider implements ProductItemFactory<Product>{

    Product makeCopy(Product originalProduct) {
        return originalProduct;
    }
    
    public Product createItem(ItemType item, Product product) {
        return null;
    }
}
