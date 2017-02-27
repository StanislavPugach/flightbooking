package com.flightbooking.model;

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

    @ManyToOne
    @JoinColumn(name = "seat")
    private Seat seat;

    @Column(name = "price")
    private float price;

    @ManyToOne
    @JoinColumn(name = "flight")
    private Flight flight;

    @Column(name = "sold")
    private boolean sold = false;

    @Column(name = "booked")
    private boolean booked = false;

    @Column(name = "deleted")
    private boolean deleted = false;

    public Ticket() {
    }

    public enum State {
        SOLD,
        BOOKED,
        DELETED

    }
    public void setState(State enumValue) {
        if (enumValue.equals(State.SOLD)){
            this.sold = true;
        }
        if (enumValue.equals(State.BOOKED)){
            booked = true;
        }
        if (enumValue.equals(State.DELETED)){
            deleted = true;
        }
    }

    public boolean isBooked() {
        return booked;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public boolean isSold() {
        return sold;
    }

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

    public float getPrice() {
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
