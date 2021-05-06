package hu.progtech.warehouse.factory;

import hu.progtech.warehouse.product.Product;

public class ProductCloneProvider implements ProductItemFactory<Product>{

    public ProductCloneProvider() {
    }

    Product makeCopy(Product originalProduct) {
        return originalProduct;
    }

    @Override
    public Product createItem(ItemType item, Product product) {
        return null;
    }

}
