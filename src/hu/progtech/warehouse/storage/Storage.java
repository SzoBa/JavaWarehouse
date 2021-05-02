package hu.progtech.warehouse.storage;

import hu.progtech.warehouse.product.ProductType;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class Storage {
    final int storageId;
    String storageName;
    final List<StockItem> commodities = new LinkedList<>();
    final List<ProductType> allowedCommodities = new ArrayList<>();

    protected Storage(int storageId, String storageName) {
        this.storageId = storageId;
        this.storageName = storageName;
    }

    public abstract List<StockItem> getStock();
    public abstract void addCommodity(StockItem stockItem);
    public abstract void deleteCommodity(int id);
}
