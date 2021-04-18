package com.aish.aop.services;

import org.springframework.stereotype.Service;

import com.aish.aop.models.Employee;

@Service
public class EmployeeService {

	private String id;
	private String firstName;
	private String secondName;
	
	
	public Employee addEmployee(Employee employee) {
		this.id=employee.getEmpId();
		this.firstName=employee.getFirstName();
		this.secondName=employee.getSecondName();
		
		Employee emp=new Employee();
		emp.setEmpId(id);
		emp.setFirstName(firstName);
		emp.setSecondName(secondName);
		 
		return emp;
	}
	
}
