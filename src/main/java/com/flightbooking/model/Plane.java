package com.flightbooking.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

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

    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "plane", orphanRemoval = true)
    private List<Seat> seats;

    @Column(name = "model")
    private String model;

    public Plane() {
    }

    public Plane(String model) {
        this.model = model;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public int getCountOfSeats() {
        int counter = 0;
        if (seats == null) {
            return counter;
        } else {
            return seats.size();
        }
    }

    public int CountOfBusinessSeats() {
        int count = 0;
        for (Seat seat : seats) {
            if (seat.isBusiness()) {
                count++;
            }
        }
        return count;
    }

    public String getModel() {
        return model;
    }
}
