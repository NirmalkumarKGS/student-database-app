package com.studentportal.model;

import javax.persistence.GenerationType;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	// To-Do: need to generate Register number based on course and unique number
	// private String RegisterNum;
	private String FirstName;
	private String LastName;
	private String EmailId;
	private String Address;
	@Temporal(value = TemporalType.TIMESTAMP)
	@org.springframework.data.annotation.CreatedDate
	private Date CreatedDate;
	@Temporal(value = TemporalType.TIMESTAMP)
	@org.springframework.data.annotation.LastModifiedDate
	private Date UpdatedDate;

	public Student() {

	}

	public Student(int id, String registerNum, String firstName, String lastName, String emailId, String address) {
		Id = id;
		// RegisterNum = registerNum;
		FirstName = firstName;
		LastName = lastName;
		EmailId = emailId;
		Address = address;
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

	public String getEmailId() {
		return EmailId;
	}

	public void setEmailId(String emailId) {
		EmailId = emailId;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Date getCreatedDate() {
		return CreatedDate;
	}

	@PrePersist
	public void setCreatedDate() {
		CreatedDate = new Date();
		UpdatedDate = new Date();
	}

	public Date getUpdatedDate() {
		return UpdatedDate;
	}

	@PreUpdate
	public void setUpdatedDate() {
		UpdatedDate = new Date();
	}

}
