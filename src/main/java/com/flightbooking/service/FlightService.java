package com.flightbooking.service;

import com.flightbooking.domain.Flight;
import com.flightbooking.persistence.Dao;

/**
 * Created by Stanislav Pugach on 18.11.2016.
 */
public class FlightService implements SimpleFlightService<Flight> {
    private final Dao<Flight> flightDao;

    public FlightService(Dao<Flight> dao){
        flightDao = dao;
    }

    @Override
    public Flight getById(long id) {
        return flightDao.getById(id);
    }

    @Override
    public Flight save(Flight entity) {
        return flightDao.save(entity);
    }
}
