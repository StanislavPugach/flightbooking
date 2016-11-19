package com.flightbooking.service;

import com.flightbooking.domain.Flight;

/**
 * Created by Stanislav Pugach on 18.11.2016.
 */
public interface SimpleFlightService<E> {
    E getById(long id);
    E save(E entity);
}
