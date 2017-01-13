package com.flightbooking.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Stanislav Pugach on 18.11.2016.
 */
@Entity(name = "flight")
public class Flight {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "flight_number")
    private String flightNumber;

    @ManyToOne
    @JoinColumn(name = "plane")
    private Plane plane;

    @ManyToOne
    @JoinColumn(name = "departure")
    private Location departure;

    @ManyToOne
    @JoinColumn(name = "arrival")
    private Location arrival;

    @Column(name = "departure_date")
    private Date departureDate;

    @Column(name = "arrival_date")
    private Date arrivalDate;

    public Flight() {
    }


    public long getId() {
        return id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public Plane getPlane() {
        return plane;
    }

    public Location getDeparture() {
        return departure;
    }

    public Location getArrival() {
        return arrival;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", flightNumber='" + flightNumber + '\'' +
                ", plane=" + plane +
                ", departure=" + departure +
                ", arrival=" + arrival +
                ", departureDate=" + departureDate +
                ", arrivalDate=" + arrivalDate +
                '}';
    }
}
