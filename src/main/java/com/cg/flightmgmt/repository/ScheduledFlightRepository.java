package com.cg.flightmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.flightmgmt.dto.Flight;
import com.cg.flightmgmt.dto.ScheduledFlight;

public interface ScheduledFlightRepository extends JpaRepository<ScheduledFlight, Flight>{

}
