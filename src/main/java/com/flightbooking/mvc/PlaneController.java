package com.flightbooking.mvc;

import com.flightbooking.domain.Plane;
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
@RequestMapping(value = "/plane", produces = MediaType.APPLICATION_JSON_VALUE)
public class PlaneController {
    @Autowired
    @Qualifier(value = "simplePlaneService")
    private SimpleService<Plane> planeService;

    @RequestMapping(value = "get", method = RequestMethod.GET)
    public ResponseEntity<Plane> getSeatById(@RequestParam long id) {
        Plane seat = planeService.getById(id);
        return new ResponseEntity<Plane>(seat, HttpStatus.OK);
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public ResponseEntity<Plane> save(@RequestBody Plane seat){
        planeService.save(seat);
        return new ResponseEntity<Plane>(seat,HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Plane> test(){
        Plane seat = new Plane();
        return new ResponseEntity<Plane>(seat,HttpStatus.OK);
    }
}
