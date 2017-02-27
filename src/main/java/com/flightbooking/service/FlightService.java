package com.flightbooking.service;

import com.flightbooking.model.Flight;
import com.flightbooking.repository.Dao;


public class FlightService implements SimpleService<Flight> {
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
