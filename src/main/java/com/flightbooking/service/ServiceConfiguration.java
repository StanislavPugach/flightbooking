package com.flightbooking.service;

import com.flightbooking.model.Flight;
import com.flightbooking.model.Plane;
import com.flightbooking.model.Seat;
import com.flightbooking.model.Ticket;
import com.flightbooking.repository.Dao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Stanislav Pugach on 18.11.2016.
 */
@Configuration
public class ServiceConfiguration {
    @Bean(name = "simpleFlightService")
    FlightService flightService(Dao<Flight> flightDao) {
        return new FlightService(flightDao);
    }

    @Bean(name = "simpleSeatService")
    SeatService seatService(Dao<Seat> seatDao) {
        return new SeatService(seatDao);
    }

    @Bean(name = "simplePlaneService")
    PlaneService planeService(Dao<Plane> planeDao) {
        return new PlaneService(planeDao);
    }

    @Bean(name = "simpleTicketService")
    TicketService ticketService(Dao<Ticket> ticketDao) {
        return new TicketService(ticketDao);
    }
}
