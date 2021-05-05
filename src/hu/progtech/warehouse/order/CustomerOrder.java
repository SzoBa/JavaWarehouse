package hu.progtech.warehouse.order;

import hu.progtech.warehouse.partner.Partner;
import hu.progtech.warehouse.product.Beverage;
import hu.progtech.warehouse.product.Product;
import hu.progtech.warehouse.product.ProductType;

public class CustomerOrder extends Order {

    public CustomerOrder(int id, Partner partner) {
        super(id, partner);
    }

    @Override
    public void updateStock() {

    }

    @Override
    void addPayable() {

    }
}
