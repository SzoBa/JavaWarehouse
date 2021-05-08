package hu.progtech.warehouse.factory;

/**
 * A ProductCloneProvider osztály createItem metódusában alkalmazható példányosítás választható osztálytípusait jelöli.
 *  A programban jelenleg létező Item alosztályokat tartalmazza.
 */
/**
 * It indicates the optional class types for instantiation that can be used in the createItem method
 * of the ProductCloneProvider class. It contains the Item subclasses currently in the application.
 */
public enum ItemType {
    ORDER_ITEM, STOCK_ITEM
}
