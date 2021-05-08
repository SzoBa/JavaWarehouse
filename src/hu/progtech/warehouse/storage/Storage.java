package hu.progtech.warehouse.storage;

import hu.progtech.warehouse.product.ProductType;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * A raktárakkal kapcsolatos információkat tárolja.
 * Az addCommodity, getCommodity, deleteCommodity absztrakt metódusokat deklarálja.
 * Listák formájában tartalmazza az adott raktárban tárolható terméktípusokat (ProductType), és termékeket (StockItem)
 */
/**
 * Stores warehouse information.
 * Declares addCommodity, getCommodity, deleteCommodity abstract methods.
 * Contains product types (ProductType) and products (StockItem) that can be stored in the given warehouse in the form of lists.
 */
public abstract class Storage {
    private final int storageId;
    private String storageName;
    private final List<StockItem> commodities = new LinkedList<>();
    private final List<ProductType> allowedCommodities = new ArrayList<>();

    public Storage(int storageId) {
        this.storageId = storageId;
    }

    public abstract void addCommodity(StockItem item);
    public abstract StockItem getCommodity(int stockItemId);
    public abstract void deleteCommodity(int stockItemId);


    public int getStorageId() {
        return storageId;
    }

    public String getStorageName() {
        return storageName;
    }

    public List<StockItem> getCommodities() {
        return commodities;
    }

    public List<ProductType> getAllowedCommodities() {
        return allowedCommodities;
    }

    public void setStorageName(String storageName) {
        this.storageName = storageName;
    }
}
