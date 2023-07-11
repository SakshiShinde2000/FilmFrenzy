package com.axis.filmfrenzy.repos;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.axis.filmfrenzy.models.Shows;

@Repository
public interface ShowsRepository extends JpaRepository<Shows, Integer> ,JpaSpecificationExecutor<Shows> {
	@Query(value = "select * from shows where fromdate<=?1 and todate>=?1",nativeQuery = true)
	List<Shows> findByDate(String date);
	
	@Query(value="select * from shows where fromDate<=date(now()) and toDate>=date(now())",nativeQuery = true)
	List<Shows> todaysShow();
	
	public List<Shows> findAll(Specification<Shows> spec);
}
