package hu.progtech.warehouse.factory;

import hu.progtech.warehouse.product.Product;
import java.math.BigDecimal;


/** The parent class of the OrderItem and StockItem classes. A Product instance and an id value are required to create it */
public abstract class Item {
    final int id;
    final Product product;
    int quantity;
    BigDecimal buyingPrice;
    int storageId;

    public Item(int id, Product product) {
        this.id = id;
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public BigDecimal getBuyingPrice() {
        return buyingPrice;
    }

    public int getStorageId() {
        return storageId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setBuyingPrice(BigDecimal buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public void setStorageId(int storageId) {
        this.storageId = storageId;
    }
}
