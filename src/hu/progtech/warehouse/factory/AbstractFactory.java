package hu.progtech.warehouse.factory;

public interface AbstractFactory <T, S>{
    T create(S type);
}
