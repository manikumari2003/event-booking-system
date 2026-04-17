package com.vcube.Event_Booking_System.controller;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.Event_Booking_System.model.Venue;
import com.vcube.Event_Booking_System.service.VenueService;

@RestController
@RequestMapping("/venues")
public class VenueController {

    private final VenueService service;

    public VenueController(VenueService service) {
        this.service = service;
    }

    @PostMapping
    public Venue create(@RequestBody Venue venue){
        return service.save(venue);
    }

    @GetMapping
    public List<Venue> getAll(){
        return service.getAll();
    }
}
