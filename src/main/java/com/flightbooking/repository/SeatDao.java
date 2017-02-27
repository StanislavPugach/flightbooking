package com.flightbooking.repository;

import com.flightbooking.model.Seat;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Transactional
public class SeatDao implements Dao<Seat> {
    @PersistenceContext
    private EntityManager manager;

    @Override
    public Seat getById(long id) {
        return manager.find(Seat.class,id);
    }

    @Override
    public Seat save(Seat seat) {
        manager.persist(seat);
        return seat;
    }
}
