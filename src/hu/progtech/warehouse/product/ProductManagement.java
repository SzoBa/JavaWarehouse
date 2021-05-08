package hu.progtech.warehouse.product;

import hu.progtech.warehouse.Management;

import java.util.ArrayList;
import java.util.List;

/** Implementálja a Management interfészt. Listában tartalmazza a Product példányokat */
/** Implements the Management interface. Contains Product instances in a list */
public class ProductManagement implements Management<Product> {

    private final List<Product> products = new ArrayList<>();

    public ProductManagement() {
    }

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
