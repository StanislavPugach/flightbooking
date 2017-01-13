package com.flightbooking.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

/**
 * Created by Stanislav Pugach on 18.11.2016.
 */
@Entity(name = "seat")
public class Seat {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "number")
    private int number;

    @Column(name = "business")
    private boolean isBusiness;

    @ManyToOne
    @JoinColumn(name = "plane")
    @JsonBackReference
    private Plane plane;

    public Seat() {
    }

    public Seat(int number, Plane plane) {
        this.number = number;
        this.plane = plane;
    }

    public Seat(int number, boolean isBusiness, Plane plane) {
        this.number = number;
        this.isBusiness = isBusiness;
        this.plane = plane;
    }

    public long getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public boolean isBusiness() {
        return isBusiness;
    }

    public Plane getPlane() {
        return plane;
    }
}
