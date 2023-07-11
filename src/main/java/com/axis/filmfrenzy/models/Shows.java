package com.axis.filmfrenzy.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Shows {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int showId;
	@ManyToOne
	@JoinColumn(name = "hall_id")
	private Hall hall;
	@ManyToOne
	@JoinColumn(name = "movie_id")
	private Movie movie;
	private int slot;
	private int price;
	private LocalDate fromDate;
	private LocalDate toDate;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	public Hall getHall() {
		return hall;
	}
	public void setHall(Hall hall) {
		this.hall = hall;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public int getSlot() {
		return slot;
	}
	public void setSlot(int slot) {
		this.slot = slot;
	}
	public LocalDate getFromDate() {
		return fromDate;
	}
	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}
	public LocalDate getToDate() {
		return toDate;
	}
	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}
	
	
}
