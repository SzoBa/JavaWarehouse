package hu.progtech.warehouse.order;

import hu.progtech.warehouse.factory.Item;
import hu.progtech.warehouse.product.Product;

import java.math.BigDecimal;

public class OrderItem extends Item {

    private BigDecimal sellingPrice;
    private int storageId;


    public OrderItem(int id, Product product) {
        super(id, product);
    }
}
