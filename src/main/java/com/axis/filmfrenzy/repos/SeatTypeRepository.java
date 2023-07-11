package com.axis.filmfrenzy.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axis.filmfrenzy.models.SeatType;

@Repository
public interface SeatTypeRepository extends JpaRepository<SeatType, Integer> {

}
