package com.studentportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.studentportal.model.Student;
import com.studentportal.service.StudentService;

@RestController
@RequestMapping("/studentportal")
public class StudentController {

	@Autowired
	@Qualifier("studentService")
	StudentService studentService;

	@GetMapping("/listall")
	public Iterable<Student> findAll() {
		return studentService.getAllStudents();
	}

	// TODO: Student register number need to generated based on selected course
	// so as of now using auto generated id
	@GetMapping("/find/{id}")
	public Student findStudentByRegisterNum(@PathVariable("id") int id) {
		return studentService.findStudentByRegisterNum(id);
	}

	@PostMapping("/register")
	public String createStudent(@RequestBody Student student) {
		return studentService.registerNewStudent(student);
	}

	@PutMapping("/updateinfo")
	public String updateStudent(@RequestBody Student student) {
		return studentService.registerNewStudent(student);
	}

	// TODO: Student register number need to generated based on selected course
	// so as of now using auto generated id
	@DeleteMapping
	public String deleteById(@RequestParam int id) {
		return studentService.deleteStudentInfo(id);
	}

}
