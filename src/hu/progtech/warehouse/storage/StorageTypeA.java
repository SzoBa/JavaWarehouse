package hu.progtech.warehouse.storage;

import java.util.List;

public class StorageTypeA extends Storage {

    protected StorageTypeA(int storageId, String storageName) {
        super(storageId, storageName);
    }

    @Override
    public List<StockItem> getStock() {
        return null;
    }

    @Override
    public void addCommodity(StockItem stockItem) {

    }

    @Override
    public void deleteCommodity(int id) {

    }
}
