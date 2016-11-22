package com.flightbooking.persistence;

import com.flightbooking.domain.Flight;
import com.flightbooking.domain.Seat;
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
}
