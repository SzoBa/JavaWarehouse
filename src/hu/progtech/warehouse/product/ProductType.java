package hu.progtech.warehouse.product;

/**
 * It serves to select the Product child class to be manufactured by ProductFactory,
 * and to define the types of products that can be stored by the various Storage instances.
 */
public enum ProductType {
    BEVERAGE, CANDY, CLOTHING, ELECTRONICS, MEDICATION, TOILETRY
}
