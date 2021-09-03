package com.studentportal.exception;

import org.springframework.http.HttpStatus;

public class StudentNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 5L;
	
	protected final HttpStatus httpStatus = HttpStatus.NOT_FOUND;	

	public StudentNotFoundException(String message) {
		super(message);
	}

}
