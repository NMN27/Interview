package com.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ISepcializationRepo;
import com.app.entity.Doctors;
import com.app.entity.Specialization;

@Service
public class SpecialisationImpli implements Ispecialisation {

	
	@Autowired
	private ISepcializationRepo ispec;
	
	
   List<Specialization> arr= new ArrayList<Specialization> ();
   @Override
	public List<Doctors> findBySpecialization(String specialization) {
		arr=ispec.findBySpecialization(specialization);
		 List<Doctors> ar= new ArrayList<Doctors> ();
		for(Specialization i:arr) {
			ar=i.getDoc();
			
		}
		
		return ar;
	}
}
