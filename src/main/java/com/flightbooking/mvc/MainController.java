package com.flightbooking.mvc;

import com.flightbooking.domain.Flight;
import com.flightbooking.service.SimpleFlightService;
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

/**
 * Created by Stanislav Pugach on 18.11.2016.
 */
@Controller
@RequestMapping(value = "/flight", produces = MediaType.APPLICATION_JSON_VALUE)
public class MainController {
    @Autowired
    @Qualifier(value = "simpleFlightService")
    private SimpleFlightService<Flight> flightService;

    @RequestMapping(value = "get", method = RequestMethod.GET)
    public ResponseEntity<Flight> getFlight(@RequestParam long id) {
        Flight flight = flightService.getById(id);
        return new ResponseEntity<Flight>(flight, HttpStatus.OK);
    }


    public ResponseEntity<Flight> save(@RequestBody Flight flight){
        flightService.save(flight);
        return new ResponseEntity<Flight>(flight,HttpStatus.OK);
    }
}
