package hu.progtech.warehouse.management;

import java.util.List;

public interface Management<T> {
    void add(T obj);
    void delete(int id);
    T get(int id);
    List<T> getAll();
}
