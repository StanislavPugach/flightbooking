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
    @Column(name = "business")
    private boolean isBusiness;
    @ManyToOne
    @JoinColumn(name = "plane")
    private Plane plane;

    public Seat() {
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
