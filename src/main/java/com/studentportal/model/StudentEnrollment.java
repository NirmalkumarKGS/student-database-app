package com.studentportal.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

@Embeddable
@Table(name = "courseclass")
public class StudentEnrollment {

	private int studentId;
	private int courseId;
	private int semester;
	private boolean feePaid;

	public StudentEnrollment(int studentId, int courseId, int semester, boolean feePaid) {
		this.studentId = studentId;
		this.courseId = courseId;
		this.semester = semester;
		this.feePaid = feePaid;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public boolean getFeePaid() {
		return feePaid;
	}

	public void setFeePaid(boolean feePaid) {
		this.feePaid = feePaid;
	}
}
