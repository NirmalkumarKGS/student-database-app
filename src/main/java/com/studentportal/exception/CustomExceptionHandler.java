package com.studentportal.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {

	@ExceptionHandler(value = { StudentNotFoundException.class })
	public ResponseEntity<Object> handleApiRequestException(StudentNotFoundException e) {
		return new ResponseEntity<>(e.getMessage(), e.httpStatus);
	}
}
