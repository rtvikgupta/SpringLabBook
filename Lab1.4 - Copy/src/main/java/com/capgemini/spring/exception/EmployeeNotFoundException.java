package com.capgemini.spring.exception;

public class EmployeeNotFoundException extends RuntimeException{

	public EmployeeNotFoundException(String msg) {
		super(msg);
	}
}
