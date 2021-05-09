package hu.progtech.warehouse.order;

import hu.progtech.warehouse.factory.Item;
import hu.progtech.warehouse.product.Product;

import java.math.BigDecimal;

/** Item child class. Represents the products on the Orders. */
public class OrderItem extends Item {

    private BigDecimal sellingPrice;


    public OrderItem(int id, Product product) {
        super(id, product);
    }

    public BigDecimal getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(BigDecimal sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
}
