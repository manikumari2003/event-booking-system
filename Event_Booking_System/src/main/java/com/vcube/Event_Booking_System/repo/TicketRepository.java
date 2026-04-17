package com.vcube.Event_Booking_System.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vcube.Event_Booking_System.model.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {

}
