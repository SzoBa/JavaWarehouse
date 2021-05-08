package hu.progtech.warehouse.storage;

import hu.progtech.warehouse.factory.GenericFactory;

/**
 * A GenericFactory interfészt implementálja.
 * Ő példányosítja a Storage gyermekosztályokat.
 */
/**
 * Implements the GenericFactory interface.
 * It instantiates the Storage child classes.
 */
public class StorageFactory implements GenericFactory<Storage, StorageType> {

    public StorageFactory() {
    }

    @Override
    public Storage create(StorageType type) {
        return null;
    }

}
