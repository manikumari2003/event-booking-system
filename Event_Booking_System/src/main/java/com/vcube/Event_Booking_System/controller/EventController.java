package com.vcube.Event_Booking_System.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.Event_Booking_System.model.Event;
import com.vcube.Event_Booking_System.service.EventService;

@RestController
@RequestMapping("/events")
public class EventController {

	private final EventService service;

	public EventController(EventService service) {
		this.service = service;
	}

	@PostMapping
	public Event create(@RequestBody Event event) {
		return service.createEvent(event);
	}

	@GetMapping
	public List<Event> getAll() {
		return service.getAllEvents();
	}

	@GetMapping("/{id}")
	public Event get(@PathVariable Long id) {
		return service.getEvent(id);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		service.deleteEvent(id);
	}
}
