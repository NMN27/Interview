package com.app.dao;


import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Doctors;

@Repository
public interface IDoctorRepo extends CrudRepository<Doctors, Integer>{
	
	
/*	@Query("Select name From Doctors Where startedYear BETWEEN ?1 AND ?1")
	public List<Doctors> findByDateBetween(Date start, Date end);*/
}
