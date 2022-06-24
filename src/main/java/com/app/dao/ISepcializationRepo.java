package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



import com.app.entity.Specialization;

@Repository
public interface ISepcializationRepo extends JpaRepository <Specialization , Integer> {

	@Query("From Specialization WHERE specialization LIKE %?1% ")
	public List<Specialization> findBySpecialization(String specialization);
	
	/*@Query("Select new com.app.dto.DoctorSpecializationDTO (s.specialiseId, s.specialization,"
			+ "d.doc_id, d.name, d.startedYear)"
			+ "FROM Specialization s"
			+ "INNER JOIN s.doctor d"
			+ "WHERE s.specialization =specialization ")
	public List<DoctorSpecializationDTO> findBySpecializationDto(String specialization);*/
	
	
	 
}