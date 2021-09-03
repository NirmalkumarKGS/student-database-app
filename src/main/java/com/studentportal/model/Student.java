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
	// TODO: need to generate Register number based on course and unique number
	// private String RegisterNum;
	@Column(name = "firstname")
	private String FirstName;

	@Column(name = "lastname")
	private String LastName;

	@Column(name = "emailid")
	private String EmailId;

	@Column(name = "address")
	private String Address;

	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name = "createddate")
	private Date CreatedDate;

	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name = "updateddate")
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
	
	public void setId(int id) {
		Id = id;
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
	
	public void setCreatedDate(Date createdDate) {
		CreatedDate = createdDate;
	}

	public Date getUpdatedDate() {
		return UpdatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		UpdatedDate = updatedDate;
	}
	
	@PrePersist
	public void setDateBeforeInsert() {
		CreatedDate = new Date();
		UpdatedDate = new Date();
	}

	@PreUpdate
	public void setDateBeforeUpdate() {
		UpdatedDate = new Date();
	}

}
