package com.cg.FlightManagement.service;

import java.util.List;

import com.cg.FlightManagement.dto.Booking;
import com.cg.FlightManagement.dto.Passenger;


public interface BookingService {
	public void addBooking(Booking b);
	public List<Booking> viewBookingById(int bookingId);
	public List<Booking> viewBooking();
	public boolean deleteBooking(int bookingId);
	public void validateBooking(Booking b);
	public void validatePassenger(Passenger p);
}
