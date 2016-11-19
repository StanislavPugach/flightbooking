package com.flightbooking.domain;

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
    @Column(name = "plane")
    private Plane plane;
    @Column(name = "departure")
    private Location departure;
    @Column(name = "arrival")
    private Location arrival;
    @Column(name = "departure_date")
    private Date departureDate;
    @Column(name = "arrival_date")
    private Date arrivalDate;


    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public Location getDeparture() {
        return departure;
    }

    public void setDeparture(Location departure) {
        this.departure = departure;
    }

    public Location getArrival() {
        return arrival;
    }

    public void setArrival(Location arrival) {
        this.arrival = arrival;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public void setId(long id) {
        this.id = id;
    }
}
