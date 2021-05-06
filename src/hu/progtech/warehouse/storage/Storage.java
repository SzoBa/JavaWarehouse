package hu.progtech.warehouse.storage;

import hu.progtech.warehouse.product.ProductType;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class Storage {
    final int storageId;
    String storageName;
    List<StockItem> commodities = new LinkedList<>();
    List<ProductType> allowedCommodities = new ArrayList<>();

    public Storage(int storageId) {
        this.storageId = storageId;
    }

    public abstract void addCommodity(StockItem item);
    public abstract StockItem getCommodity(int stockItemId);
    public abstract void deleteCommodity(int stockItemId);
}
