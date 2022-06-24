package com.app.service;

import java.util.List;

import com.app.entity.Doctors;

public interface Ispecialisation {

	List<Doctors> findBySpecialization(String specialization);

}
