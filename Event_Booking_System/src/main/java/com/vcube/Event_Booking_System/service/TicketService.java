package com.vcube.Event_Booking_System.service;



import java.util.List;

import org.springframework.stereotype.Service;

import com.vcube.Event_Booking_System.model.Ticket;
import com.vcube.Event_Booking_System.repo.TicketRepository;

@Service
public class TicketService {

    private final TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    // Create Ticket
    public Ticket createTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    // Get All Tickets
    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    // Get Ticket by ID
    public Ticket getTicketById(Long id) {
        return ticketRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ticket not found with id: " + id));
    }

    // Delete Ticket
    public void deleteTicket(Long id) {
        ticketRepository.deleteById(id);
    }
}