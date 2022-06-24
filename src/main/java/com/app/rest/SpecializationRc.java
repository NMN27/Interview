package com.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.ISepcializationRepo;
import com.app.entity.Doctors;
import com.app.entity.Specialization;
import com.app.service.Ispecialisation;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class SpecializationRc {
	@Autowired
	private ISepcializationRepo specRepo;
	
	@Autowired
	private Ispecialisation spec;
	
	
	@GetMapping("/specializations")
	public List<Specialization> findAllSpecialize(){
		return (List<Specialization>) specRepo.findAll();
	}
	
	@PostMapping("/specializations")
	public void addSpecialization(@RequestBody Specialization specialize) {
		specRepo.save(specialize);
	}

	
	@GetMapping("/specializations/{specialization}")
		public List<Doctors> findBySpecialization(@PathVariable String specialization) {
			return  spec.findBySpecialization(specialization);
		
	}
}
