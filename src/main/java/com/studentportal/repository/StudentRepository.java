package com.studentportal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.studentportal.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

	//TODO: This query need to be changed based on roll number 
	@Query(value="Select * from student where Id = :id", nativeQuery = true)
	public Optional<Student> findStudentByRegisterNum(int id);
	
	@Modifying
	@Transactional
	@Query(value ="delete from student where Id = :id", nativeQuery = true)
	public void deleteStudentInfo(@Param("id") int id);
}
	