package com.axis.filmfrenzy.dtos;

import org.springframework.web.multipart.MultipartFile;

import com.axis.filmfrenzy.models.Movie;

public class MovieDTO extends Movie {

	private MultipartFile photo;

	public MultipartFile getPhoto() {
		return photo;
	}

	public void setPhoto(MultipartFile photo) {
		this.photo = photo;
	}
	
	
}
