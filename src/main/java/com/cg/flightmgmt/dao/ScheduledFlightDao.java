package com.cg.flightmgmt.dao;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.flightmgmt.dto.Airport;
import com.cg.flightmgmt.dto.ScheduledFlight;
import com.cg.flightmgmt.repository.ScheduledFlightRepository;
import com.cg.flightmgmt.service.ScheduledFlightService;

@Service
public class ScheduledFlightDao implements ScheduledFlightService{
	@Autowired
	private ScheduledFlightRepository repo;
	
	@Override
	public ScheduledFlight addScheduleFlight(ScheduledFlight flight) {
		return repo.save(flight);
	}
	@Override
	public List<ScheduledFlight> viewScheduledFlight(){
		return repo.findAll();
	}
	@Override
	public List<ScheduledFlight> viewScheduledFlights(Airport source, Airport dest, LocalDate arrivaldate){
		List<ScheduledFlight> ans = new ArrayList<>();
		List<ScheduledFlight> list = repo.findAll();
		for(ScheduledFlight s: list) {
			if(s.getSchedule().getSourceAirport().equals(source) &&  s.getSchedule().getDestinationAirport().equals(dest)) {
				ans.add(s);
			}
		}
		return ans;
	}
	@Override
	public List<ScheduledFlight> viewScheduledFlights(BigInteger flightno){
		List<ScheduledFlight> ans = new ArrayList<>();
		List<ScheduledFlight> list = repo.findAll();
		for(ScheduledFlight s: list) {
			if(s.getFlight().getFlightNumber()==flightno) {
				ans.add(s);
			}
		}
		return ans;
	}
	@Override
	public void deleteFlightSchedule(BigInteger flightno){
		repo.delete(repo.getById(flightno));
	}
	@Override
	public ScheduledFlight modifyFlightSchedule(ScheduledFlight flight) {
		return repo.save(flight);
	}
	@Override
	public void validateScheduledFlight(ScheduledFlight flight) {
		
	}
}
