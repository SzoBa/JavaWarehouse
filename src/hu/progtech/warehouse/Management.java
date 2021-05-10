package hu.progtech.warehouse;

import java.util.List;

/**
 * This interface provides access to the central (store) classes of the modules.
 * It declares the actions that can be performed on the contents.
 */
public interface Management <T>{
    void add(T item);
    void delete(int itemId);
    T get(int itemId);
    List<T> getAll();
}
