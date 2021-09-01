package com.studentportal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "courseclass")
public class Syllabus {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ClassId")
	private int Id;
	private int courseId;
	private int lecturerId;
	private int semester;
	private String className;

	public Syllabus() {
	}

	public Syllabus(int id, int courseId, int lecturerId, int semester, String className) {
		Id = id;
		this.courseId = courseId;
		this.lecturerId = lecturerId;
		this.semester = semester;
		this.className = className;
	}

	public int getId() {
		return Id;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getLecturerId() {
		return lecturerId;
	}

	public void setLecturerId(int lecturerId) {
		this.lecturerId = lecturerId;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
}
