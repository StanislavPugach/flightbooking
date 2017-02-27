package com.flightbooking.repository;

import com.flightbooking.model.Ticket;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Transactional
public class TicketDao implements Dao<Ticket> {
    @PersistenceContext
    private EntityManager manager;

    @Override
    public Ticket getById(long id) {
         return manager.find(Ticket.class,id);
    }

    @Override
    public Ticket save(Ticket ticket) {
        manager.persist(ticket);
        return ticket;
    }
}
