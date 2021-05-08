package hu.progtech.warehouse.storage;

import hu.progtech.warehouse.Management;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/** Implements the Management interface. Contains Storage instances in a list */
public class StorageManagement implements Management<Storage> {

    private final List<Storage> storages = new ArrayList<>();

    public StorageManagement() {
    }

    @Override
    public void add(Storage storage) {
        storages.add(storage);
    }

    @Override
    public void delete(int storageId) {
        Optional<Storage> removable = storages.stream().filter(item -> item.getStorageId() == storageId).findFirst();
        if (removable.isPresent()) {
            storages.remove(removable.get());
        } else {
            System.out.println("Invalid storage id!");
        }
    }

    @Override
    public Storage get(int storageId) {
        return storages.stream().filter(item -> item.getStorageId() == storageId).findFirst().orElse(null);
    }

    @Override
    public List<Storage> getAll() {
        return storages;
    }

}
