package com.app.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.entity.Doctors;

@Repository
public interface IDoctorsRepo extends JpaRepository <Doctors, Integer> { 
	
	public List<Doctors> findByStartedYearBetween(Date star, Date end);
	
	@Query("From Doctors WHERE name Like %?1%")
	public List<Doctors>findByNameIs(String name);
	
	

}
