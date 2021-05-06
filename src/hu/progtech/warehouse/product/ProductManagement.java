package hu.progtech.warehouse.product;

import hu.progtech.warehouse.Management;
import hu.progtech.warehouse.storage.Storage;

import java.util.ArrayList;
import java.util.List;

public class ProductManagement implements Management<Product> {

    private final List<Product> products = new ArrayList<>();

    @Override
    public void add(Product product) {

    }

    @Override
    public void delete(int productId) {

    }

    @Override
    public Product get(int productId) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return products;
    }
}
