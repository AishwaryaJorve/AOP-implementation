package com.aish.aop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aish.aop.models.Employee;
import com.aish.aop.services.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
private EmployeeService employeeService;
	
	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		Employee emp=employeeService.addEmployee(employee);
		return emp;
	}
	
}
