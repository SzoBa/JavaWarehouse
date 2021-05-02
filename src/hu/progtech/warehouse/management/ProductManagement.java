package hu.progtech.warehouse.management;

import hu.progtech.warehouse.product.Product;

import java.util.LinkedList;
import java.util.List;

public class ProductManagement implements Management<Product>{
    private final List<Product> products = new LinkedList<Product>();
    @Override
    public void add(Product obj) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Product get(int id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return this.products;
    }
}
