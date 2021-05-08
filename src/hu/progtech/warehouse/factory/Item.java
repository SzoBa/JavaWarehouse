package hu.progtech.warehouse.factory;

import hu.progtech.warehouse.product.Product;
import java.math.BigDecimal;

/** Az OrderItem és StockItem osztályok szülőosztálya. Létrehozásához egy Product példány, és egy id érték szükséges */
/** The parent class of the OrderItem and StockItem classes. A Product instance and an id value are required to create it */
public abstract class Item {
    final int id;
    Product product;
    int quantity;
    BigDecimal buyingPrice;
    int storageId;

    public Item(int id, Product product) {
        this.id = id;
        this.product = product;
    }
}
