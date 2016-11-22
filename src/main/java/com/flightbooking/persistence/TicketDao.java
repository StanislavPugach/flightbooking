package com.flightbooking.persistence;

import com.flightbooking.domain.Flight;
import com.flightbooking.domain.Ticket;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Stanislav Pugach on 22.11.2016.
 */
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
