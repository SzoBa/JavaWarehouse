package hu.progtech.warehouse.storage;

import hu.progtech.warehouse.factory.GenericFactory;

public class StorageFactory implements GenericFactory<Storage, StorageType> {

    public StorageFactory() {
    }

    @Override
    public Storage create(StorageType type) {
        return null;
    }

}
