package com.studentportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.studentportal.exception.StudentNotFoundException;
import com.studentportal.model.Student;
import com.studentportal.service.StudentService;

@RestController
@RequestMapping("/student-portal")
public class StudentController {

	@Autowired
	@Qualifier("studentService")
	StudentService studentService;

	@GetMapping("/list-all")
	public ResponseEntity<Iterable<Student>> findAll() {
		List<Student> students = (List<Student>) studentService.getAllStudents();
		if (students.isEmpty())
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		else
			return new ResponseEntity<>(students, HttpStatus.OK);
	}

	// TODO: Student register number need to be generated based on selected course
	// so as of now using auto generated id
	@GetMapping("/find/{id}")
	public ResponseEntity<Student> findStudentByRegisterNum(@PathVariable("id") int id) {
		Student student = studentService.findStudentByRegisterNum(id);
		if (student != null)
			return new ResponseEntity<>(student, HttpStatus.OK);
		else
			throw new StudentNotFoundException("Student Not Found!");
	}

	@PostMapping("/register")
	public ResponseEntity<String> createStudent(@RequestBody Student student) {
		String status = studentService.registerNewStudent(student);
		if (status != null)
			return new ResponseEntity<String>(status, HttpStatus.CREATED);
		else
			return new ResponseEntity<>("Unable to register student", HttpStatus.INTERNAL_SERVER_ERROR);

	}

	@PutMapping("/update")
	public ResponseEntity<String> updateStudent(@RequestBody Student student) {
		String status = studentService.updateStudentInfo(student);
		if (status != null)
			return new ResponseEntity<String>(status, HttpStatus.OK);
		else
			return new ResponseEntity<>("Unable to update student", HttpStatus.NOT_MODIFIED);
	}

	// TODO: Student register number need to generated based on selected course
	// so as of now using auto generated id
	@DeleteMapping
	public ResponseEntity<String> deleteById(@RequestParam int id) {
		String status = studentService.deleteStudentInfo(id);
		if (status != null)
			return new ResponseEntity<String>(status, HttpStatus.OK);
		else
			return new ResponseEntity<>("Error occured!", HttpStatus.NOT_FOUND);
	}

}
