package hu.progtech.warehouse.order;

import hu.progtech.warehouse.product.Product;

public class OrderItem {
    private final Product product;
    private int quantity;
    private final float buyingPrice;
    private float sellingPrice;
    private final int storageId;

    public OrderItem(Product product, int quantity, float buyingPrice, float sellingPrice, int storageId) {
        this.product = product;
        this.quantity = quantity;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.storageId = storageId;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getBuyingPrice() {
        return buyingPrice;
    }

    public float getSellingPrice() {
        return sellingPrice;
    }

    public int getStorageId() {
        return storageId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setSellingPrice(float sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
}
