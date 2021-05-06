package hu.progtech.warehouse.storage;

import hu.progtech.warehouse.Management;

import java.util.ArrayList;
import java.util.List;

public class StorageManagement implements Management<Storage> {

    private final List<Storage> storages = new ArrayList<>();

    public StorageManagement() {
    }

    @Override
    public void add(Storage storage) {

    }

    @Override
    public void delete(int storageId) {

    }

    @Override
    public Storage get(int storageId) {
        return null;
    }

    @Override
    public List<Storage> getAll() {
        return storages;
    }

}
