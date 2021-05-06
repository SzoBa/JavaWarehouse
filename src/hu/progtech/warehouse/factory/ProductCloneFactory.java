package hu.progtech.warehouse.factory;

import hu.progtech.warehouse.product.Product;

public class ProductCloneFactory implements ProductItemFactory<Product>{

    Product makeCopy(Product originalProduct) {
        return originalProduct;
    }


    @Override
    public Product createItem(ItemType item, Product product) {
        return null;
    }

}
