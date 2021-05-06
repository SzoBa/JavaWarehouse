package hu.progtech.warehouse.partner;

import hu.progtech.warehouse.order.Order;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Payable {

    private BigDecimal value;
    private LocalDateTime expiration;
    private boolean isPaid;
    private final Order order;

    public Payable(Order order) {
        this.order = order;
    }

    public BigDecimal getValue() {
        return value;
    }

    public LocalDateTime getExpiration() {
        return expiration;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public Order getOrder() {
        return order;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public void setExpiration(LocalDateTime expiration) {
        this.expiration = expiration;
    }
}
