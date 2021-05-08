package hu.progtech.warehouse.product;

import hu.progtech.warehouse.Management;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/** Implements the Management interface. Contains Product instances in a list */
public class ProductManagement implements Management<Product> {

    private final List<Product> products = new ArrayList<>();

    public ProductManagement() {
    }

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public void delete(int productId) {
        Optional<Product> removable = products.stream().filter(item -> item.getId() == productId).findFirst();
        if (removable.isPresent()) {
            products.remove(removable.get());
        } else {
            System.out.println("Invalid product id!");
        }
    }

    @Override
    public Product get(int productId) {
        return products.stream().filter(item -> item.getId() == productId).findFirst().orElse(null);
    }

    @Override
    public List<Product> getAll() {
        return products;
    }
}
