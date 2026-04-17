package com.vcube.Event_Booking_System.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vcube.Event_Booking_System.model.User;
import com.vcube.Event_Booking_System.repo.UserRepository;

@Service
public class UserService {

	private final UserRepository repo;

	public UserService(UserRepository repo) {
		this.repo = repo;
	}

	public User save(User user) {
		return repo.save(user);
	}

	public List<User> getAll() {
		return repo.findAll();
	}
}