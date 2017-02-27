package com.flightbooking.repository;

import com.flightbooking.model.Flight;
import com.flightbooking.model.Plane;
import com.flightbooking.model.Seat;
import com.flightbooking.model.Ticket;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DaoConfiguration {
    @Bean
    Dao<Flight> flightDao() {
        return new FlightDao();
    }

    @Bean
    Dao<Seat> seatDao() {
        return new SeatDao();
    }

    @Bean
    Dao<Plane> planeDao() {
        return new PlaneDao();
    }

    @Bean
    Dao<Ticket> ticketDao() {
        return new TicketDao();
    }
}
