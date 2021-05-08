package hu.progtech.warehouse.storage;

/** A StorageFactory által gyártása kerülő Storage gyermekosztály kiválasztására szolgál */
/** It serves to select the Storage child class to be manufactured by StorageFactory */
public enum StorageType {
    MEZZANINE_FLOOR, MULTI_TIER_RACK, STATIC_SHELF
}
