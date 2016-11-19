package com.flightbooking.persistence;

import com.flightbooking.domain.Flight;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Stanislav Pugach on 18.11.2016.
 */
@Transactional
public class FlightDao implements Dao<Flight>{
    @PersistenceContext
    private EntityManager manager;


    @Override
    public Flight getById(long id) {
        return manager.find(Flight.class,id);
    }

    @Override
    public Flight save(Flight flight) {
        manager.persist(flight);
        return flight;
    }
}
