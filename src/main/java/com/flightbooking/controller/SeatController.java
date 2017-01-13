package com.flightbooking.controller;

import com.flightbooking.model.Seat;
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

/**
 * Created by Stanislav Pugach on 22.11.2016.
 */
@Controller
@RequestMapping(value = "/seat", produces = MediaType.APPLICATION_JSON_VALUE)
public class SeatController {
    @Autowired
    @Qualifier(value = "simpleSeatService")
    private SimpleService<Seat> seatService;

    @RequestMapping(value = "get", method = RequestMethod.GET)
    public ResponseEntity<Seat> getSeatById(@RequestParam long id) {
        Seat seat = seatService.getById(id);
        return new ResponseEntity<Seat>(seat, HttpStatus.OK);
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public ResponseEntity<Seat> save(@RequestBody Seat seat){
        seatService.save(seat);
        return new ResponseEntity<Seat>(seat,HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Seat> test(){
        Seat seat = new Seat();
        return new ResponseEntity<Seat>(seat,HttpStatus.OK);
    }
}
