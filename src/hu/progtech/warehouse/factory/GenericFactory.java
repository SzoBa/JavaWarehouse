package hu.progtech.warehouse.factory;

/** Generikus csatoló, a modulok gyár osztályai implementálják, és az általuk példányosított osztályok létrehozását deklarálja */
/** Generic interface, implemented by the factory classes of the modules, and declares the creation of classes they instantiate*/
public interface GenericFactory<T, S>{
    T create(S type);
}
