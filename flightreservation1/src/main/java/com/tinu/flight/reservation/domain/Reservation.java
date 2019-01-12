package com.tinu.flight.reservation.domain;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Reservation extends AbstractDomain {
	private int numberOfBabs;

	private Boolean checkedIn;
	@OneToOne
	private Passenger passenger;
	@OneToOne
	private Flight flight;
	public int getNumberOfBabs() {
		return numberOfBabs;
	}
	public void setNumberOfBabs(int numberOfBabs) {
		this.numberOfBabs = numberOfBabs;
	}
	public Boolean getCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(Boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
}
