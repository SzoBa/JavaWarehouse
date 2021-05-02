package hu.progtech.warehouse.storage;

import java.util.List;

public class StorageTypeC extends Storage {

    public StorageTypeC(int storageId, String storageName) {
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
