package com.flightbooking.service;

import com.flightbooking.domain.Flight;
import com.flightbooking.domain.Seat;
import com.flightbooking.persistence.Dao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Stanislav Pugach on 18.11.2016.
 */
@Configuration
public class ServiceConfiguration {
    @Bean(name = "simpleFlightService")
    FlightService flightService(Dao<Flight> flightDao){
        return new FlightService(flightDao);
    }

    @Bean(name = "simpleSeatService")
    SeatService seatService(Dao<Seat> seatDao) {
        return new SeatService(seatDao);
    }

}
