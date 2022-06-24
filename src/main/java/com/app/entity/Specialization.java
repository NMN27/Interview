package com.app.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="specialization")
public class Specialization {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int specialiseId;
	private String specialization;
	
	@OneToMany(mappedBy="spec", cascade=CascadeType.ALL)
	private List<Doctors> doc = new ArrayList<Doctors>();
	
	public Specialization() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSpecialiseId() {
		return specialiseId;
	}

	public void setSpecialiseId(int specialiseId) {
		this.specialiseId = specialiseId;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	public List<Doctors> getDoc() {
		return doc;
	}

	public void setDoc(List<Doctors> doc) {
		this.doc = doc;
	}

	@Override
	public String toString() {
		return "Specialization [specialiseId=" + specialiseId + ", specialization=" + specialization + ", doc=" + doc
				+ "]";
	}


	
	
	

}
