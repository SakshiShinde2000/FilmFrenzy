package com.axis.filmfrenzy.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axis.filmfrenzy.models.Hall;
import com.axis.filmfrenzy.models.HallCapacity;

@Repository
public interface HallCapacityRepository extends JpaRepository<HallCapacity, Integer> {
	
	List<HallCapacity> findByHall(Hall hall);

}
