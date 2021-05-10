package hu.progtech.warehouse.factory;

/** Generic interface, implemented by the factory classes of the modules, and declares the creation of classes they instantiate*/
public interface GenericFactory<T, S>{
    T create(S type);
}
