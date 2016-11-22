package com.flightbooking.mvc;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Stanislav Pugach on 22.11.2016.
 */
@Controller
@RequestMapping(value = "ticket", produces = MediaType.APPLICATION_JSON_VALUE)
public class TicketController {

}
