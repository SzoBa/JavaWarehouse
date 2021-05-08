package hu.progtech.warehouse.factory;

public class FactoryProvider {

    public FactoryProvider() {
    }

    /** Egy FactoryType megadását kéri, majd az annak megfelelő modulhoz tartozó gyár osztállyal tér vissza */
    /** It requires a FactoryType and then returns a factory class for the corresponding module */
    public GenericFactory<?, ?> getFactory(FactoryType type) {
        return null;
    }
}
