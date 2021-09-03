package com.studentportal.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.studentportal.model.Student;
import com.studentportal.repository.StudentRepository;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepo;

	@Override
	public Iterable<Student> getAllStudents() {
		try {
			return studentRepo.findAll();
		} catch (DataAccessException ex) {
			System.out.println(ex.getLocalizedMessage());
			return null;
		}
	}

	@Override
	public Student findStudentByRegisterNum(int id) {
		Optional<Student> student = studentRepo.findStudentByRegisterNum(id);
		if (student.isPresent()) {
			return student.get();
		} else {
			return null;
		}
	}

	@Override
	public String registerNewStudent(Student student) {
		try {
			studentRepo.save(student);
			return "Student has been registered successfull with register Id: " + student.getId();
		} catch (DataAccessException ex) {
			System.out.println(ex.getLocalizedMessage());
			return null;
		}
	}

	@Override
	public String updateStudentInfo(Student student) {
		try {
			Optional<Student> existingStudent = studentRepo.findStudentByRegisterNum(student.getId());
			if (existingStudent.isPresent()) {
				student.setCreatedDate(existingStudent.get().getCreatedDate());
				studentRepo.save(student);
				return "Student details are updated!";
			} else {
				return "Failed to udpate student details!";
			}
		} catch (DataAccessException ex) {
			System.out.println(ex.getLocalizedMessage());
			return null;
		}
	}

	@Override
	public String deleteStudentInfo(int id) {
		studentRepo.deleteStudentInfo(id);
		return "Student details deleted!";
	}

}
