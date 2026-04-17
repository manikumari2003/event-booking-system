package com.vcube.Event_Booking_System.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vcube.Event_Booking_System.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

}