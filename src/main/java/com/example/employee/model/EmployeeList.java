package com.example.employee.model;

import java.util.List;

public class EmployeeList {

	private List<Employee> EmpList;


	public List<Employee> getEmpList() {
		return EmpList;
	}

	public void setEmpList(List<Employee> empList) {
		EmpList = empList;
	}

	@Override
	public String toString() {
		return "EmployeeList [EmpList=" + EmpList + "]";
	}
}
