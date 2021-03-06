package com.cg.flightmgmt.dto;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Scheduled_Flight_table")
public class ScheduledFlight {
	@Id
	private BigInteger scheduleFlightId;
	private Flight flight;
	private int availableSeats;
	private Schedule schedule;
	
	public ScheduledFlight() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ScheduledFlight(BigInteger scheduleFlightId, Flight flight, int availableSeats, Schedule schedule) {
		super();
		this.scheduleFlightId = scheduleFlightId;
		this.flight = flight;
		this.availableSeats = availableSeats;
		this.schedule = schedule;
	}
	
	public BigInteger getScheduleFlightId() {
		return scheduleFlightId;
	}
	public void setScheduleFlightId(BigInteger scheduleFlightId) {
		this.scheduleFlightId = scheduleFlightId;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
}
