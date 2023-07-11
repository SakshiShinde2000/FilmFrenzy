package com.axis.filmfrenzy.dtos;

import java.time.LocalDate;

public class SearchDTO {

	private int slot;
	private int hallId;
	private String movieName;
	private LocalDate date;
	public int getSlot() {
		return slot;
	}
	public void setSlot(int slot) {
		this.slot = slot;
	}
	public int getHallId() {
		return hallId;
	}
	public void setHallId(int hallId) {
		this.hallId = hallId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "SearchDTO [slot=" + slot + ", hallId=" + hallId + ", movieName=" + movieName + ", date=" + date + "]";
	}	
	
	
}
