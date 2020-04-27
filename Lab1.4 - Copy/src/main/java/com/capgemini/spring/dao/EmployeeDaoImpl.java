package com.capgemini.spring.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.capgemini.spring.entities.Employee;

@Component
public class EmployeeDaoImpl {

private Map<Integer, Employee> store = new HashMap<Integer, Employee>();
	
	public EmployeeDaoImpl() {
		store.put(100,new Employee(100,"Rahul",45225.25));
		store.put(101,new Employee(101,"Rtvik",42751.40));
		store.put(102,new Employee(102,"Rohan",44962.70));
		store.put(103,new Employee(103,"Sohan",47896.36));
		store.put(104,new Employee(104,"Raman",46847.89));
	}
	
	public List<Employee> fethcAllEmployees(){
		Collection<Employee> collection = store.values();
		List<Employee> empList = new ArrayList(collection);
		return empList;
	}
	public Employee findEmployee(int id) {
		Employee employee = store.get(id);
		return employee;
	}
}
