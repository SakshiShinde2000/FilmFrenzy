package com.axis.filmfrenzy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.filmfrenzy.models.SeatType;
import com.axis.filmfrenzy.repos.SeatTypeRepository;

@Service
public class SeatTypeService {
	@Autowired private SeatTypeRepository repo;

	public void save(SeatType st) {
		repo.save(st);
	}

	public List<SeatType> listall(){
		return repo.findAll();
	}

	public SeatType findById(int id) {
		return repo.getById(id);
	}

	public void deleteSeatType(int id) {
		repo.delete(repo.getById(id));
	}
}
