package hu.progtech.warehouse;

import java.util.List;

public interface Management <T>{
    void add(T item);
    void delete(int itemId);
    T get(int itemId);
    List<T> getAll();
}
