package com.axis.filmfrenzy.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class HallCapacity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name = "hall_id")
	@JsonBackReference
	private Hall hall;
	@ManyToOne
	@JoinColumn(name = "seat_type_id")
	private SeatType seatType;
	private int seatCount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Hall getHall() {
		return hall;
	}
	public void setHall(Hall hall) {
		this.hall = hall;
	}
	public SeatType getSeatType() {
		return seatType;
	}
	public void setSeatType(SeatType seatType) {
		this.seatType = seatType;
	}
	public int getSeatCount() {
		return seatCount;
	}
	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}
	
	
	
}
