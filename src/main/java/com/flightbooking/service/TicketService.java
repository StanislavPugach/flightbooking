package com.flightbooking.service;

import com.flightbooking.domain.Ticket;
import com.flightbooking.persistence.Dao;

/**
 * Created by Татьяна on 22.11.2016.
 */
public class TicketService implements SimpleService<Ticket> {
    private final Dao<Ticket> ticketDao;

    public TicketService(Dao<Ticket> ticketDao) {
        this.ticketDao = ticketDao;
    }

    @Override
    public Ticket getById(long id) {
        return ticketDao.getById(id);
    }

    @Override
    public Ticket save(Ticket entity) {
        return ticketDao.save(entity);
    }
}
