package com.flightbooking.service;

import com.flightbooking.domain.Plane;
import com.flightbooking.persistence.Dao;

/**
 * Created by Stanislav Pugach on 22.11.2016.
 */
public class PlaneService implements SimpleService<Plane> {
    private final Dao<Plane> planeDao;

    public PlaneService(Dao<Plane> planeDao) {
        this.planeDao = planeDao;
    }

    @Override
    public Plane getById(long id) {
        return null;
    }

    @Override
    public Plane save(Plane entity) {
        return null;
    }
}
