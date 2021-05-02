package hu.progtech.warehouse.storage;

import hu.progtech.warehouse.product.Product;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class StockItem {
    private final Product product;
    private int quantity;
    private BigDecimal buyingPrice;
    private LocalDateTime expirationDate;

    public StockItem(Product product, int quantity, BigDecimal buyingPrice, LocalDateTime expirationDate) {
        this.product = product;
        this.quantity = quantity;
        this.buyingPrice = buyingPrice;
        this.expirationDate = expirationDate;
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

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public void setBuyingPrice(BigDecimal buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }
}
