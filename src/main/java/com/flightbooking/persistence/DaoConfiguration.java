package com.flightbooking.persistence;

import com.flightbooking.domain.Flight;
import com.flightbooking.domain.Plane;
import com.flightbooking.domain.Seat;
import com.flightbooking.domain.Ticket;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Stanislav Pugach on 18.11.2016.
 */
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
