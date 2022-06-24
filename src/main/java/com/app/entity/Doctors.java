package com.app.entity;






import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table (name="doctor")
public class Doctors {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int doc_id;
	private String name;
	private Date startedYear;
	
	private int specialiseId;
	
	@ManyToOne
	@JoinColumn(name="specialiseId",  insertable = false, updatable = false)
	private Specialization spec;

	public Doctors() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctors(int doc_id, String name, Date startedYear, int specialiseId, Specialization spec) {
		super();
		this.doc_id = doc_id;
		this.name = name;
		this.startedYear = startedYear;
		this.specialiseId = specialiseId;
		this.spec = spec;
	}

	public int getDoc_id() {
		return doc_id;
	}

	public void setDoc_id(int doc_id) {
		this.doc_id = doc_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartedYear() {
		return startedYear;
	}

	public void setStartedYear(Date startedYear) {
		this.startedYear = startedYear;
	}

	public int getSpecialiseId() {
		return specialiseId;
	}

	public void setSpecialiseId(int specialiseId) {
		this.specialiseId = specialiseId;
	}
	@JsonBackReference
	public Specialization getSpec() {
		return spec;
	}

	public void setSpec(Specialization spec) {
		this.spec = spec;
	}

	@Override
	public String toString() {
		return "Doctor [doc_id=" + doc_id + ", name=" + name + ", startedYear=" + startedYear + ", specialiseId="
				+ specialiseId + ", spec=" + spec + "]";
	}

	
	
}
