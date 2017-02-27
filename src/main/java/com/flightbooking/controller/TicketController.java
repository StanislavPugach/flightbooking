package com.flightbooking.controller;

import com.flightbooking.model.Ticket;
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
@RequestMapping(value = "/ticket", produces = MediaType.APPLICATION_JSON_VALUE)
public class TicketController {
    @Autowired
    @Qualifier(value = "simpleTicketService")
    private SimpleService<Ticket> ticketService;

    @RequestMapping(value = "get", method = RequestMethod.GET)
    public ResponseEntity<Ticket> getSeatById(@RequestParam long id) {
        Ticket ticket = ticketService.getById(id);
        return new ResponseEntity<Ticket>(ticket, HttpStatus.OK);
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public ResponseEntity<Ticket> save(@RequestBody Ticket ticket) {
       ticketService.save(ticket);
        return new ResponseEntity<Ticket>(ticket, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Ticket> test() {
        Ticket ticket = new Ticket();
        return new ResponseEntity<Ticket>(ticket, HttpStatus.OK);
    }
}
