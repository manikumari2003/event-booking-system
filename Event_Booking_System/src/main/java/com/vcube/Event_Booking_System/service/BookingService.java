package com.vcube.Event_Booking_System.service;


import org.springframework.stereotype.Service;

import com.vcube.Event_Booking_System.model.Booking;
import com.vcube.Event_Booking_System.model.Event;
import com.vcube.Event_Booking_System.model.PaymentStatus;
import com.vcube.Event_Booking_System.repo.BookingRepository;
import com.vcube.Event_Booking_System.repo.EventRepository;

@Service
public class BookingService {

    private final BookingRepository bookingRepo;
    private final EventRepository eventRepo;

    public BookingService(BookingRepository bookingRepo, EventRepository eventRepo) {
        this.bookingRepo = bookingRepo;
        this.eventRepo = eventRepo;
    }

    public Booking bookEvent(Booking booking) {

        Event event = eventRepo.findById(booking.getEvent().getId()).orElseThrow();

        if(event.getAvailableSeats() <= 0)
            throw new RuntimeException("No seats available");

        event.setAvailableSeats(event.getAvailableSeats() - 1);
        eventRepo.save(event);

        booking.setPaymentStatus(PaymentStatus.SUCCESS);

        return bookingRepo.save(booking);
    }
}
