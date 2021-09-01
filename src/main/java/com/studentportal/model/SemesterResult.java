package com.studentportal.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

@Embeddable
@Table(name = "studentsemesterhistory")
public class SemesterResult {
	private int studentId;
	private int semester;
	private boolean cleared;

	public SemesterResult() {
		
	}
	
	public SemesterResult(int studentId, int semester, boolean cleared) {
		this.studentId = studentId;
		this.semester = semester;
		this.cleared = cleared;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public boolean isCleared() {
		return cleared;
	}

	public void setCleared(boolean cleared) {
		this.cleared = cleared;
	}
}
