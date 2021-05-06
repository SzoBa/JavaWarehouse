package hu.progtech.warehouse.partner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Partner {

    private final int id;
    String name;
    String address;
    String email;
    String phone;
    PriceGroup priceGroup;
    final Map<Integer, BigDecimal> uniquePrices = new HashMap<>();
    BigDecimal creditLine;
    String accountInfo;
    final List<Payable> payables = new ArrayList<>();

    public Partner(int id) {
        this.id = id;
    }

    public void addPayable(Payable payable) {

    }

    public Payable getPayable(int orderId) {
        return null;
    }

    public void deletePayable(int orderId) {

    }

    public BigDecimal getUniquePrice(int productId) {
        return null;
    }

    public void deleteUniquePrice(int productId) {

    }

    public BigDecimal getTotalPending() {
        return null;
    }

    public void addUniquePrice(int productId, BigDecimal price) {

    }

    public abstract String getContactPerson();
    public abstract void setContactPerson();


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public PriceGroup getPriceGroup() {
        return priceGroup;
    }

    public Map<Integer, BigDecimal> getUniquePrices() {
        return uniquePrices;
    }

    public BigDecimal getCreditLine() {
        return creditLine;
    }

    public String getAccountInfo() {
        return accountInfo;
    }

    public List<Payable> getPayables() {
        return payables;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPriceGroup(PriceGroup priceGroup) {
        this.priceGroup = priceGroup;
    }

    public void setCreditLine(BigDecimal creditLine) {
        this.creditLine = creditLine;
    }

    public void setAccountInfo(String accountInfo) {
        this.accountInfo = accountInfo;
    }
}
