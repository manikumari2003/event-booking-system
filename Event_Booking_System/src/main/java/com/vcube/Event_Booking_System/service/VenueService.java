package com.vcube.Event_Booking_System.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.vcube.Event_Booking_System.model.Venue;
import com.vcube.Event_Booking_System.repo.VenueRepository;

@Service
public class VenueService {

    private final VenueRepository repo;

    public VenueService(VenueRepository repo) {
        this.repo = repo;
    }

    public Venue save(Venue venue) {
        return repo.save(venue);
    }

    public List<Venue> getAll() {
        return repo.findAll();
    }
}
