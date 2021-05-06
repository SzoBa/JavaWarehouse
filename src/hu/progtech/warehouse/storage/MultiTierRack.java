package hu.progtech.warehouse.storage;

public class MultiTierRack extends Storage{

    public MultiTierRack(int storageId) {
        super(storageId);
    }

    @Override
    public void addCommodity(StockItem item) {

    }

    @Override
    public StockItem getCommodity(int itemId) {
        return null;
    }

    @Override
    public void deleteCommodity(int itemId) {

    }
}
