package com.studentportal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lecturer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String FirstName;
	private String LastName;
	private int Experience;
	private boolean IsHOD;

	public Lecturer() {

	}

	public Lecturer(int id, String firstName, String lastName, int experience, boolean isHOD) {
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		Experience = experience;
		IsHOD = isHOD;
	}

	public int getId() {
		return Id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getExperience() {
		return Experience;
	}

	public void setExperience(int experience) {
		Experience = experience;
	}

	public boolean isIsHOD() {
		return IsHOD;
	}

	public void setIsHOD(boolean isHOD) {
		IsHOD = isHOD;
	}
}
