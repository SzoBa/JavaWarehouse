package hu.progtech.warehouse.storage;

import hu.progtech.warehouse.factory.Item;
import hu.progtech.warehouse.product.Product;

import java.time.LocalDateTime;

/** Item gyermekosztály. A Storage-okban tárolható termékeket reprezentálja. */
/** Item child class. Represents products that can be stored in Storages.  */
public class StockItem extends Item {

    private LocalDateTime expirationDate;

    public StockItem(int id, Product product) {
        super(id, product);
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }
}
