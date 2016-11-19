package com.flightbooking.domain;

import javax.persistence.*;

/**
 * Created by Stanislav Pugach on 18.11.2016.
 */
@Entity(name = "ticket")
public class Ticket {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "seat")
    private Seat seat;
    @Column(name = "price")
    private int price;
    @Column(name = "flight")
    private Flight flight;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
