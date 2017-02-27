package com.flightbooking.controller;

import com.flightbooking.controller.request.PlaneRequest;
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
@RequestMapping(value = "/plane", produces = MediaType.APPLICATION_JSON_VALUE)
public class PlaneController {
    @Autowired
    @Qualifier(value = "simplePlaneService")
    private SimpleService<PlaneRequest> planeService;

    @RequestMapping(value = "get", method = RequestMethod.GET)
    public ResponseEntity<PlaneRequest> getPlaneById(@RequestParam long id) {
        PlaneRequest planeRequest = planeService.getById(id);
        return new ResponseEntity<>(planeRequest, HttpStatus.OK);
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public ResponseEntity<PlaneRequest> save(@RequestBody PlaneRequest planeRequest){
        planeService.save(planeRequest);
        return new ResponseEntity<>(planeRequest,HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<PlaneRequest> test(){
        PlaneRequest plane = new PlaneRequest();
        return new ResponseEntity<>(plane,HttpStatus.OK);
    }
}
