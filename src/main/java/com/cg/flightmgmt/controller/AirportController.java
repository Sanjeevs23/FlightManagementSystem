package com.cg.flightmgmt.controller;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.flightmgmt.dao.AirportDao;
import com.cg.flightmgmt.dto.Airport;
import com.cg.flightmgmt.exception.AirportNotFoundException;

@RestController
@RequestMapping("/airport")
public class AirportController {
	Logger logger=org.slf4j.LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private AirportDao dao;
	
	//localhost:5010/airport/airports
	@RequestMapping(path="/airports")
	public List<Airport> viewAllAirports(){
		return dao.viewAirport();
	}
	
	//localhost:5010/airport/airports/:id
	@GetMapping(path="/airports/{id}")
	public Airport viewAirport(@PathVariable int airportCode) throws AirportNotFoundException{
		return dao.viewAirport(airportCode);
	}
}
