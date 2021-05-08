package hu.progtech.warehouse.storage;

import java.util.Optional;

/** An instantiatable child class of the Storage abstract class. It is used to represent storage types */
public class StaticShelf extends Storage{

    public StaticShelf(int storageId) {
        super(storageId);
    }

    @Override
    public void addCommodity(StockItem item) {
        this.commodities.add(item);
    }

    @Override
    public StockItem getCommodity(int stockItemId) {
        return this.commodities.stream().filter(item -> item.getId() == stockItemId).findFirst().orElse(null);
    }

    @Override
    public void deleteCommodity(int stockItemId) {
        Optional<StockItem> removable = this.commodities.stream().filter(item -> item.getId() == stockItemId).findFirst();
        if (removable.isPresent()) {
            this.commodities.remove(removable.get());
        } else {
            System.out.println("Invalid StockItem id!");
        }
    }
}
