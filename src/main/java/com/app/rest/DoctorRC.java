package com.app.rest;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.IDoctorsRepo;
import com.app.entity.Doctors;


@CrossOrigin
@RestController
@RequestMapping("/api")
public class DoctorRC {
	
	@Autowired
	private IDoctorsRepo docsRepo;
	
	//view all doctor
	@GetMapping("/doctors")
	public List<Doctors> getAllDoc(){
		return(List<Doctors>) docsRepo.findAll();
	}
	
	//add doctor
	@PostMapping("/doctors")
	public void saveDoc(@RequestBody Doctors doctor) {
		docsRepo.save(doctor);
}
	
	//find by name
	@GetMapping("/doctors/{name}")
		public List<Doctors> findByName(@PathVariable String name){
		return (List<Doctors>)docsRepo.findByNameIs(name);
	}
	
	@GetMapping("/doctors/date")
	public List<Doctors>findDocByDate(@RequestParam Date start, @RequestParam Date end){
		return (List<Doctors>)docsRepo.findByStartedYearBetween(start, end);
	}
}