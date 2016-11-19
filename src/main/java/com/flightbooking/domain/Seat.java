package com.flightbooking.domain;

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
    @ManyToOne
    @JoinColumn(name = "plane_id")
    private Plane plane;

    public int getNumber() {
        return number;
    }
}
