package hu.progtech.warehouse.management;

import hu.progtech.warehouse.storage.Storage;

import java.util.ArrayList;
import java.util.List;

public class StorageManagement implements Management<Storage> {
    private final List<Storage> storages = new ArrayList<Storage>();

    @Override
    public void add(Storage storage) {
        storages.add(storage);
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Storage get(int id) {
        return null;
    }

    @Override
    public List<Storage> getAll() {
        return this.storages;
    }
}
