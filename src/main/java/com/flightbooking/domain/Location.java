package com.flightbooking.domain;

import javax.persistence.*;

/**
 * Created by Stanislav Pugach on 18.11.2016.
 */
@Entity(name = "location")
public class Location {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "place")
    private String location;

    public Location(){
    }

    public long getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }
}
