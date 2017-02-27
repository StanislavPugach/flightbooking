package com.flightbooking.repository;


public interface Dao<E> {
    E getById(long id);

    E save(E e);
}
