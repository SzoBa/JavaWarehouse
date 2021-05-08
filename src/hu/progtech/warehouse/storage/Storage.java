package hu.progtech.warehouse.storage;

import hu.progtech.warehouse.product.ProductType;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * Stores warehouse information.
 * Declares addCommodity, getCommodity, deleteCommodity abstract methods.
 * Contains product types (ProductType) and products (StockItem) that can be stored in the given warehouse in the form of lists.
 */
public abstract class Storage {
    protected final int storageId;
    protected String storageName;
    protected final List<StockItem> commodities = new LinkedList<>();
    protected final List<ProductType> allowedCommodities = new ArrayList<>();

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Storage)) return false;
        Storage storage = (Storage) o;
        return storageId == storage.storageId && Objects.equals(storageName, storage.storageName) && Objects.equals(commodities, storage.commodities) && Objects.equals(allowedCommodities, storage.allowedCommodities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storageId, storageName, commodities, allowedCommodities);
    }
}
