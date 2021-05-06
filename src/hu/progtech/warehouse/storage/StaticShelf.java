package hu.progtech.warehouse.storage;

public class StaticShelf extends Storage{

    public StaticShelf(int storageId) {
        super(storageId);
    }

    @Override
    public void addCommodity(StockItem item) {

    }

    @Override
    public StockItem getCommodity(int stockItemId) {
        return null;
    }

    @Override
    public void deleteCommodity(int stockItemId) {

    }
}
