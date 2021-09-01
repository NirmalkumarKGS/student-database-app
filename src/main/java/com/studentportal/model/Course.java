package com.studentportal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CourseId;
	private String CourseName;

	public Course() {

	}

	public Course(int courseId, String courseName) {
		CourseId = courseId;
		CourseName = courseName;
	}

	public int getCourseId() {
		return CourseId;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
}
