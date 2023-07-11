package com.axis.filmfrenzy.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SeatType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int seatTypeId;
	private String seatTypeDesc;
	private int fare;
	public int getSeatTypeId() {
		return seatTypeId;
	}
	public void setSeatTypeId(int seatTypeId) {
		this.seatTypeId = seatTypeId;
	}
	public String getSeatTypeDesc() {
		return seatTypeDesc;
	}
	public void setSeatTypeDesc(String seatTypeDesc) {
		this.seatTypeDesc = seatTypeDesc;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}
	
	
}
