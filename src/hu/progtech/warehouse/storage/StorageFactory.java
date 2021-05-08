package hu.progtech.warehouse.storage;

import hu.progtech.warehouse.IdGenerator;
import hu.progtech.warehouse.factory.GenericFactory;

/**
 * Implements the GenericFactory interface.
 * It instantiates the Storage child classes.
 */
public class StorageFactory implements GenericFactory<Storage, StorageType> {

    public StorageFactory() {
    }

    @Override
    public Storage create(StorageType type) {
        int id = IdGenerator.getNewId();
        switch (type) {
            case STATIC_SHELF:
                return new StaticShelf(id);
            case MEZZANINE_FLOOR:
                return new MezzanineFloor(id);
            case MULTI_TIER_RACK:
                return new MultiTierRack(id);
            default:
                return null;
        }
    }

}
