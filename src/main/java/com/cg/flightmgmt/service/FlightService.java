package com.cg.flightmgmt.service;

import java.math.BigInteger;
import java.util.List;

import com.cg.flightmgmt.dto.Flight;

public interface FlightService {
	public Flight addFlight(Flight flight);
	public Flight viewFlight(BigInteger flightno);
	public List<Flight> viewFlight();
	public void deleteFlight(BigInteger flightno);
	public Flight modifyFlight(Flight flight);
	public void validateFlight(Flight flight);
}
