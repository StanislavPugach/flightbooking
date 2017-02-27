package com.flightbooking.service;

/**
 * Created by Stanislav Pugach on 18.11.2016.
 */
public interface SimpleService<E> {
    E getById(long id);
    E save(E entity);
}
