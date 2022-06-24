package com.app.service;

import java.sql.Date;
import java.util.List;


import com.app.entity.Doctors;

public interface IDoctorService {

	public void saveDoctor(Doctors doctor);
	
	public List <Doctors> getAllDoc();
	
	//public List<Doctors> findByNames(String name);
	
	
}

