package hu.progtech.warehouse.factory;

import hu.progtech.warehouse.product.Product;

import java.math.BigDecimal;

public abstract class Item {
    final int id;
    Product product;
    int quantity;
    BigDecimal buyingPrice;
    int storageId;

    public Item(int id, Product product) {
        this.id = id;
        this.product = product;
    }
}
