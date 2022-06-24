package com.app.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IDoctorRepo;
import com.app.entity.Doctors;
@Service
public class DoctorSrviceImple implements IDoctorService {
	@Autowired
	private IDoctorRepo docRepo;

	
	public void saveDoctor(Doctors doctor) {
		docRepo.save(doctor);
		
	}

	
	public List<Doctors> getAllDoc() {
		
		return (List<Doctors>)docRepo.findAll();
	}

	/*public List<Doctors> findByNames(String name) {
		
		return (List<Doctors>)docRepo.findByNameIs(name);
	}*/


	
	
	
}
