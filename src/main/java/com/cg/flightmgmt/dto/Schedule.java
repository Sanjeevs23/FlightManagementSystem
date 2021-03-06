package com.cg.flightmgmt.dto;

import java.math.BigInteger;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Schedule_table")
public class Schedule {
	@Id
	private BigInteger scheduleId;
	private Airport sourceAirport;
	private Airport destinationAirport;
	private LocalDateTime arrivalTime;
	private LocalDateTime departureTime;
	
	public Schedule() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Schedule(BigInteger scheduleId, Airport sourceAirport, Airport destinationAirport, LocalDateTime arrivalTime,
			LocalDateTime departureTime) {
		super();
		this.scheduleId = scheduleId;
		this.sourceAirport = sourceAirport;
		this.destinationAirport = destinationAirport;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
	}
	public BigInteger getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(BigInteger scheduleId) {
		this.scheduleId = scheduleId;
	}
	public Airport getSourceAirport() {
		return sourceAirport;
	}
	public void setSourceAirport(Airport sourceAirport) {
		this.sourceAirport = sourceAirport;
	}
	public Airport getDestinationAirport() {
		return destinationAirport;
	}
	public void setDestinationAirport(Airport destinationAirport) {
		this.destinationAirport = destinationAirport;
	}
	public LocalDateTime getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(LocalDateTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public LocalDateTime getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(LocalDateTime departureTime) {
		this.departureTime = departureTime;
	}
}
