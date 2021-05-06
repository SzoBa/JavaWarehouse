package hu.progtech.warehouse.factory;

public interface GenericFactory<T, S>{
    T create(S type);
}
