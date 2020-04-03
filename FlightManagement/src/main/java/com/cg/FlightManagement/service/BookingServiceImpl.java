package com.cg.FlightManagement.service;

import java.util.ArrayList;
import java.util.List;

import com.cg.FlightManagement.dto.Booking;
import com.cg.FlightManagement.dto.Passenger;


public class BookingServiceImpl implements BookingService{

	List<Booking> bookingList=new ArrayList<Booking>();
	@Override
	public void addBooking(Booking b) {
		// TODO Auto-generated method stub
		bookingList.add(b);
	}

	@Override
	public List<Booking> viewBookingById(int bookingId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Booking> viewBooking() {
		// TODO Auto-generated method stub
		return bookingList;
	}

	@Override
	public boolean deleteBooking(int bookingId) {
		// TODO Auto-generated method stub
		boolean available=false;
		for(Booking b1:bookingList) {
			if(b1.getBookingId()==bookingId) {
				bookingList.remove(b1);
				available=true;
				break;
			}
		}
		return available;
	}

	@Override
	public void validateBooking(Booking b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void validatePassenger(Passenger p) {
		// TODO Auto-generated method stub
		
	}
	
}

