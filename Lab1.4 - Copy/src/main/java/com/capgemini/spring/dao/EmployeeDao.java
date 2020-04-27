package com.capgemini.spring.dao;

import java.util.List;

import com.capgemini.spring.entities.Employee;

public interface EmployeeDao {
	List<Employee>fetchAllEmployees();
}
