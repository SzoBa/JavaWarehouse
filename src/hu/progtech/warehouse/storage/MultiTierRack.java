package hu.progtech.warehouse.storage;

/** A Storage absztakt osztály példányosítható gyermekosztálya. A raktárfajták reprezentálására szolgál */
/** An instantiatable child class of the Storage abstract class. It is used to represent storage types */
public class MultiTierRack extends Storage{

    public MultiTierRack(int storageId) {
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
