package com.example.employee.service;

import java.util.List;

import com.example.employee.model.Employee;

public interface EmployeeInterface {

	 Employee saveDetails(Employee employee);
	 List<Employee> saveAllDetails(List<Employee> employee);
	 List<Employee> getDetails();
	 Employee updateDetails(Employee employee);
	 Employee getDetailsbyId(int id);
	 Employee getFirstName(String FirstName);
	 Employee getLastName(String LastName);
	 Employee deleteDetailsbyId(int id);
	
	
}
