package com.flightbooking.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Stanislav Pugach on 18.11.2016.
 */
@Entity(name = "plane")
 public class Plane {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "plane", orphanRemoval = true)
    private List<Seat> seats;
    @Column(name = "model")
    private String model;



    public String getModel() {
        return model;
    }
}
