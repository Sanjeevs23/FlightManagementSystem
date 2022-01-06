package com.cg.flightmgmt.service;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;

import com.cg.flightmgmt.dto.Airport;
import com.cg.flightmgmt.dto.Flight;
import com.cg.flightmgmt.dto.ScheduledFlight;

public interface ScheduledFlightService {
	public ScheduledFlight addScheduleFlight(ScheduledFlight flight);
	public List<ScheduledFlight> viewScheduledFlight();
	public List<ScheduledFlight> viewScheduledFlights(Airport source, Airport dest, LocalDate arrivaldate);
	public List<ScheduledFlight> viewScheduledFlights(BigInteger flightno);
	public void deleteFlightSchedule(BigInteger flightno);
	public ScheduledFlight modifyFlightSchedule(ScheduledFlight flight);
	public void validateScheduledFlight(ScheduledFlight flight);
}
