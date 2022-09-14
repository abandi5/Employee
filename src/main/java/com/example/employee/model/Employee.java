package com.example.employee.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Required;

import com.sun.istack.NotNull;

@Entity
@Table(name = "Employee_Table")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	
	@Column(name="FirstName")
	
	private String FirstName;
	
	private String LastName;
	private BigDecimal Salary;
	private String DepartmentName;
	private int MobileNo;
	private String Address;
	private Date HireDate;
	private String Designation;
	private Date DOB;
	private String City;
	private String Country;
	private String Postalcode;
	private String State;
	private String Email;
	private String Gender;
	
	
	
	
	
	
	
	}
	
	
