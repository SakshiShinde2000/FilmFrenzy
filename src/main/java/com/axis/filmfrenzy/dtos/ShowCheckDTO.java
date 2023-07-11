package com.axis.filmfrenzy.dtos;

import java.time.LocalDate;

public class ShowCheckDTO {

	private int showid;
	private LocalDate date;
	
	public int getShowid() {
		return showid;
	}
	public void setShowid(int showid) {
		this.showid = showid;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
}
