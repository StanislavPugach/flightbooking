package com.flightbooking.controller;

import com.flightbooking.model.Flight;
import com.flightbooking.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping(value = "/flight", produces = MediaType.APPLICATION_JSON_VALUE)
public class FlightController {
    @Autowired
    @Qualifier(value = "simpleFlightService")
    private SimpleService<Flight> flightService;

    @RequestMapping(value = "get", method = RequestMethod.GET)
    public ResponseEntity<Flight> getFlight(@RequestParam long id) {
        Flight flight = flightService.getById(id);
        return new ResponseEntity<Flight>(flight, HttpStatus.OK);
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public ResponseEntity<Flight> save(@RequestBody Flight flight){
        flightService.save(flight);
        return new ResponseEntity<Flight>(flight,HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Flight> test(@RequestBody Flight flight){
        System.out.println(flight);
        return new ResponseEntity<Flight>(flight,HttpStatus.OK);
    }
}
