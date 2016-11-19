package com.flightbooking.persistence;

/**
 * Created by Stanislav Pugach on 18.11.2016.
 */
public interface Dao<E> {
    E getById(long id);

    E save(E e);
}
