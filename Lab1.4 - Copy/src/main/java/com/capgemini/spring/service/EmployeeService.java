package com.capgemini.spring.service;

import java.util.List;

import com.capgemini.spring.entities.Employee;

public interface EmployeeService {
	List<Employee>fetchAllEmployees();
}
