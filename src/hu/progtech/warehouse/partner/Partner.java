package hu.progtech.warehouse.partner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A raktárral kapcsolatban álló entitásokat reprezentálja (vevők/szállítók).
 * A partnerrel kapcsolatos adatokat tárolja, pl. árcsoport, egyedi árak, hitelkeret, tartozások (Payable), stb.
 * A getContactPerson és setContactPerson absztrakt metódusokat deklarálja (vevőnél üzletkötő, szállítónál beszerző).
 */
/**
 * Represents entities related to the warehouse (customers / suppliers).
 * Stores partner information, e.g. price group, unique prices, credit line, debts (Payable), etc.
 * It declares getContactPerson and setContactPerson abstract methods (salesperson at customer, buyer at supplier).
 */
public abstract class Partner {

    private final int id;
    private String name;
    private String address;
    private String email;
    private String phone;
    private PriceGroup priceGroup;
    private final Map<Integer, BigDecimal> uniquePrices = new HashMap<>();
    private BigDecimal creditLine;
    private String accountInfo;
    private final List<Payable> payables = new ArrayList<>();

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
