package hu.progtech.warehouse.partner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class Partner {
    final int id;
    String name;
    String address;
    String email;
    String phoneNumber;
    BigDecimal creditLine;
    String accountInfo;
    List<Payable> payables = new ArrayList<Payable>();

    public Partner(int id) {
        this.id = id;
    }

    public abstract String getContactPerson();

    public void addPayable(Payable payable) {

    }

    public void deletePayable(int id) {

    }

    public Payable getPayable(int id) {
        return null;
    }

    public BigDecimal getTotalPending() {
        return null;
    }


}
