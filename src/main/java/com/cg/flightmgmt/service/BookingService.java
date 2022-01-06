package com.cg.flightmgmt.service;

import java.math.BigInteger;
import java.util.List;

import com.cg.flightmgmt.dto.Booking;
import com.cg.flightmgmt.dto.Passenger;

public interface BookingService {
	public Booking addBooking(Booking booking);
	public void deleteBooking(BigInteger bookingid);
	public Booking modifyBooking(Booking booking);
	public Booking viewBooking(BigInteger bookingid);
	public List<Booking> viewBooking();
	public void validateBooking(Booking booking);
	public void validatePassenger(Passenger passenger);
}
