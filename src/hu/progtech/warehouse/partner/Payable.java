package hu.progtech.warehouse.partner;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Payable {
    private final int id;
    private BigDecimal value;
    private final int orderId;
    private LocalDateTime expiration;
    private boolean isPayed;

    public Payable(int id, BigDecimal value, int orderId, LocalDateTime expiration) {
        this.id = id;
        this.value = value;
        this.orderId = orderId;
        this.expiration = expiration;
    }

    public void markAsPaid() {
        this.isPayed = true;
    }

    public int getId() {
        return id;
    }

    public BigDecimal getValue() {
        return value;
    }

    public int getOrderId() {
        return orderId;
    }

    public LocalDateTime getExpiration() {
        return expiration;
    }

    public boolean isPayed() {
        return isPayed;
    }


    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public void setExpiration(LocalDateTime expiration) {
        this.expiration = expiration;
    }
}
