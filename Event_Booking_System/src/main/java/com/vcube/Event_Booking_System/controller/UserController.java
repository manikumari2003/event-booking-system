package com.vcube.Event_Booking_System.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.Event_Booking_System.model.User;
import com.vcube.Event_Booking_System.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	private final UserService service;

	public UserController(UserService service) {
		this.service = service;
	}

	@PostMapping
	public User create(@RequestBody User user) {
		return service.save(user);
	}

	@GetMapping
	public List<User> getAll() {
		return service.getAll();
	}
}