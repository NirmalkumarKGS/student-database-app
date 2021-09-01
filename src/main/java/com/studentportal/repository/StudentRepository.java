package com.studentportal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.studentportal.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

	@Query(value="Select * from student;", nativeQuery = true)
	public List<Student> findAllStudent();
	
	@Query(value="Select * from student where Id = :id", nativeQuery = true)
	public Optional<Student> findStudentByRegisterNum(int id);
	
	@Modifying
	@Query(value ="delete from student where Id = :id", nativeQuery = true)
	public void deleteStudentInfo(int id);
}
	