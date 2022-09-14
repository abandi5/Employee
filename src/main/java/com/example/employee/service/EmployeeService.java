package com.example.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.model.Employee;
import com.example.employee.repository.EmployeeRepository;


@Service
public class EmployeeService implements EmployeeInterface {

	@Autowired
	EmployeeRepository repo;
	
	@Override
	public Employee saveDetails(Employee employee) {
		
		return null;
	}

	@Override
	public List<Employee> saveAllDetails(List<Employee> employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateDetails(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getDetailsbyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getFirstName(String FirstName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getLastName(String LastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee deleteDetailsbyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
