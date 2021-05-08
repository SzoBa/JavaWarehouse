package hu.progtech.warehouse.product;

/**
 * A ProductFactory által gyártása kerülő Product gyermekosztály kiválasztására,
 * valamint a különféle Storage osztálypéldányok által tárolható termékfajták meghatározására szolgál.
 */
/**
 * It serves to select the Product child class to be manufactured by ProductFactory,
 * and to define the types of products that can be stored by the various Storage instances.
 */
public enum ProductType {
    BEVERAGE, CANDY, CLOTHING, ELECTRONICS, MEDICATION, TOILETRY
}
