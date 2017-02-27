package com.flightbooking.repository;

import com.flightbooking.model.Plane;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Transactional
public class PlaneDao implements Dao<Plane>{
    @PersistenceContext
    private EntityManager manager;

    @Override
    public Plane getById(long id) {
        return manager.find(Plane.class,id);
    }

    @Override
    public Plane save(Plane plane) {
        manager.persist(plane);
        return plane;
    }

}
