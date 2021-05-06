package hu.progtech.warehouse.storage;

public class MezzanineFloor extends Storage{

    public MezzanineFloor(int storageId) {
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
