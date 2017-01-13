package com.flightbooking.service;

import com.flightbooking.model.Plane;
import com.flightbooking.model.Seat;
import com.flightbooking.controller.request.PlaneRequest;
import com.flightbooking.repository.Dao;

import java.util.ArrayList;


/**
 * Created by Stanislav Pugach on 22.11.2016.
 */
public class PlaneService implements SimpleService<PlaneRequest> {
    private final Dao<Plane> planeDao;

    public PlaneService(Dao<Plane> planeDao) {
        this.planeDao = planeDao;
    }

    @Override
    public PlaneRequest getById(long id) {
        Plane plane =  planeDao.getById(id);
        PlaneRequest planeRequest = new PlaneRequest(plane.getModel()
                ,plane.getCountOfSeats(),plane.CountOfBusinessSeats());
        return planeRequest;
    }

    @Override
    public PlaneRequest save(PlaneRequest entity) {
        Plane plane = new Plane(entity.getModel());
        ArrayList<Seat> seats = new ArrayList<>();
        for (int i = 0; i < entity.getCountOfSeats(); i++) {
            if (i < entity.getCountOfBusiness()) {
                seats.add(new Seat(i, true, plane));
            } else {
                seats.add(new Seat(i,plane));
            }
        }
        plane.setSeats(seats);
        planeDao.save(plane);
        return entity;
    }

}
