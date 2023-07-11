package com.axis.filmfrenzy.dtos;

import com.axis.filmfrenzy.models.Shows;

public class ShowDTO extends Shows {

	private int hallId;
	private int movieId;
	public int getHallId() {
		return hallId;
	}
	public void setHallId(int hallId) {
		this.hallId = hallId;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	@Override
	public String toString() {
		return "ShowDTO [hallId=" + hallId + ", movieId=" + movieId + "]";
	}
	
	
}
