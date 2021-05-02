package hu.progtech.warehouse.storage;

import java.util.List;

public class StorageTypeB extends Storage {

    public StorageTypeB(int storageId, String storageName) {
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
