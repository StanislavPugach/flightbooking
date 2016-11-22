package com.flightbooking.service;

import com.flightbooking.domain.Seat;
import com.flightbooking.persistence.Dao;

/**
 * Created by Stanislav Pugach on 22.11.2016.
 */
public class SeatService implements SimpleService<Seat> {
    private final Dao<Seat> seatDao;

    public SeatService(Dao<Seat> dao) {
        seatDao = dao;
    }

    @Override
    public Seat getById(long id) {
        return seatDao.getById(id);
    }

    @Override
    public Seat save(Seat entity) {
        return seatDao.save(entity);
    }
}
