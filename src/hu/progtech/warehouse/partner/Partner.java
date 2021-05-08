package hu.progtech.warehouse.partner;

import java.math.BigDecimal;
import java.util.*;

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
        payables.add(payable);
    }

    public Payable getPayable(int orderId) {
        return payables.stream().filter(item -> item.getOrder().getOrderId() == orderId).findFirst().orElse(null);
    }

    public void deletePayable(int orderId) {
        Optional<Payable> removable = payables.stream().filter(item -> item.getOrder().getOrderId() == orderId).findFirst();
        if (removable.isPresent()) {
            payables.remove(removable.get());
        } else {
            System.out.println("Invalid order id!");
        }
    }

    public BigDecimal getUniquePrice(int productId) {
        return uniquePrices.getOrDefault(productId, new BigDecimal(0));
    }

    public void deleteUniquePrice(int productId) {
        uniquePrices.remove(productId);
    }

    public BigDecimal getTotalPending() {
        return payables.stream().reduce(new BigDecimal(0), (actualSum, voucher) -> (actualSum.add(voucher.getValue())), BigDecimal::add);
    }

    public void addUniquePrice(int productId, BigDecimal price) {
        uniquePrices.put(productId, price);
    }

    public abstract String getContactPerson();
    public abstract void setContactPerson(String name);


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
