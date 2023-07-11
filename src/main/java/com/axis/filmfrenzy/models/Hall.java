package com.axis.filmfrenzy.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Hall {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hallId;
	private String hallDesc;
	private int capacity;
	@OneToMany	
	private List<HallCapacity> hallcapacity;
	
	public List<HallCapacity> getHallcapacity() {
		return hallcapacity;
	}
	public void setHallcapacity(List<HallCapacity> hallcapacity) {
		this.hallcapacity = hallcapacity;
	}
	public int getHallId() {
		return hallId;
	}
	public void setHallId(int hallId) {
		this.hallId = hallId;
	}
	public String getHallDesc() {
		return hallDesc;
	}
	public void setHallDesc(String hallDesc) {
		this.hallDesc = hallDesc;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
}
