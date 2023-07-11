package com.axis.filmfrenzy.dtos;

import com.axis.filmfrenzy.models.Booking;

public class BookingDTO extends Booking {
	private int showId;
	private int userId;
	private int seatTypeId;
	private int[] seatnums;
	
	public int[] getSeatnums() {
		return seatnums;
	}
	public void setSeatnums(int[] seatnums) {
		this.seatnums = seatnums;
	}
	public int getSeatTypeId() {
		return seatTypeId;
	}
	public void setSeatTypeId(int seatTypeId) {
		this.seatTypeId = seatTypeId;
	}
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

}
