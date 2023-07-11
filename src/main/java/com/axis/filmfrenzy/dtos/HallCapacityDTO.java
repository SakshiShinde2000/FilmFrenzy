package com.axis.filmfrenzy.dtos;

import com.axis.filmfrenzy.models.HallCapacity;

public class HallCapacityDTO extends HallCapacity {
	private int seatTypeId;
	private int hallId;

	public int getHallId() {
		return hallId;
	}

	public void setHallId(int hallId) {
		this.hallId = hallId;
	}

	public int getSeatTypeId() {
		return seatTypeId;
	}

	public void setSeatTypeId(int seatTypeId) {
		this.seatTypeId = seatTypeId;
	}
	
}
