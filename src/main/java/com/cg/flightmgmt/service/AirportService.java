package com.cg.flightmgmt.service;

import java.util.List;

import com.cg.flightmgmt.dto.Airport;

public interface AirportService {
    public List<Airport> viewAirport();
    public Airport viewAirport(int airportCode);
}
