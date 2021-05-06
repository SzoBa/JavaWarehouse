package hu.progtech.warehouse.storage;

import hu.progtech.warehouse.factory.AbstractFactory;

public class StorageFactory implements AbstractFactory<Storage, StorageType> {

    public StorageFactory() {
    }

    @Override
    public Storage create(StorageType type) {
        return null;
    }

}
