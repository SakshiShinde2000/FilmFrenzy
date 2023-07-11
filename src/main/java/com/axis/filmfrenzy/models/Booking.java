package com.axis.filmfrenzy.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingId;
	@ManyToOne
	@JoinColumn(name = "show_id")
	private Shows show;
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	private LocalDate bookDate;
	private LocalDate showDate;
	private String status;
	
	private String seatnos;
	private int noOfSeats;
	private float cost;
	private float cancelCharges;
	
	public Booking() {
		this.bookDate=LocalDate.now();
		this.status="Booked";
	}
	
	
	public String getSeatnos() {
		return seatnos;
	}


	public void setSeatnos(String seatnos) {
		this.seatnos = seatnos;
	}


	public float getCancelCharges() {
		return cancelCharges;
	}


	public void setCancelCharges(float cancelCharges) {
		this.cancelCharges = cancelCharges;
	}


	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}


	public int getNoOfSeats() {
		return noOfSeats;
	}


	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}


	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public Shows getShow() {
		return show;
	}
	public void setShow(Shows show) {
		this.show = show;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public LocalDate getBookDate() {
		return bookDate;
	}
	public void setBookDate(LocalDate bookDate) {
		this.bookDate = bookDate;
	}
	public LocalDate getShowDate() {
		return showDate;
	}
	public void setShowDate(LocalDate showDate) {
		this.showDate = showDate;
	}
	
	
}
