package com.cg.flightmgmt.dao;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.flightmgmt.dto.Booking;
import com.cg.flightmgmt.dto.Passenger;
import com.cg.flightmgmt.exception.BookingNotFoundException;
import com.cg.flightmgmt.repository.BookingRepository;
import com.cg.flightmgmt.service.BookingService;

@Service
public class BookingDao implements BookingService{
	@Autowired
	private BookingRepository repo;
	
	@Override
	public Booking addBooking(Booking booking) {
		return repo.save(booking);
	}
	
	@Override
	public void deleteBooking(BigInteger bookingid) {
		repo.delete(repo.getById(bookingid));
	}
	
	@Override
	public Booking modifyBooking(Booking booking) {
		return repo.save(booking);
	}
	
	@Override
	public Booking viewBooking(BigInteger bookingid) throws BookingNotFoundException{
		Optional<Booking> found = repo.findById(bookingid);
		if(found.isPresent()) {
			return found.get();
		}else {
			throw new BookingNotFoundException("This booking does not exist");
		}
	}
	
	@Override
	public List<Booking> viewBooking(){
		return repo.findAll();
	}
	
	@Override
	public void validateBooking(Booking booking) {
		
	}
	
	@Override
	public void validatePassenger(Passenger passenger) {
		
	}
}
