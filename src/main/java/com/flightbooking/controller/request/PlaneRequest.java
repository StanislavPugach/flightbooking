package com.flightbooking.controller.request;

import javax.persistence.Entity;

/**
 * Created by Stanislav Pugach on 22.11.2016.
 */
@Entity
public class PlaneRequest {
    private String model;
    private int countOfSeats;
    private int countOfBusiness;

    public PlaneRequest() {
    }

    public PlaneRequest(String model, int countOfSeats, int countOfBusiness) {
        this.model = model;
        this.countOfSeats = countOfSeats;
        this.countOfBusiness = countOfBusiness;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCountOfSeats() {
        return countOfSeats;
    }

    public void setCountOfSeats(int countOfSeats) {
        this.countOfSeats = countOfSeats;
    }

    public int getCountOfBusiness() {
        return countOfBusiness;
    }

    public void setCountOfBusiness(int countOfBusiness) {
        this.countOfBusiness = countOfBusiness;
    }
}
