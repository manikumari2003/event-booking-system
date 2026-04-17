package com.vcube.Event_Booking_System.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vcube.Event_Booking_System.model.Event;
import com.vcube.Event_Booking_System.repo.EventRepository;

@Service
public class EventService {

	private final EventRepository repo;

	public EventService(EventRepository repo) {
		this.repo = repo;
	}

	public Event createEvent(Event event) {
		event.setAvailableSeats(event.getTotalSeats());
		return repo.save(event);
	}

	public List<Event> getAllEvents() {
		return repo.findAll();
	}

	public Event getEvent(Long id) {
		return repo.findById(id).orElseThrow();
	}

	public void deleteEvent(Long id) {
		repo.deleteById(id);
	}
}