package com.studentportal.service;

import org.springframework.stereotype.Service;

import com.studentportal.model.Student;

public interface StudentService {

	Iterable<Student> getAllStudents();
	
	Student findStudentByRegisterNum(int id);
	
	String registerNewStudent(Student student);
	
	String updateStudentInfo(Student student);
	
	String deleteStudentInfo(int id);
	
}
