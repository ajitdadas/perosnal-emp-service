package com.peronal.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peronal.emp.model.Employee;
import com.peronal.emp.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/appName")
	public String welcomeEmployee() {
		return "Welcome In Personal Employee Management";
	}
	
	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable("id") int id) {
		return employeeService.getEmployee(id);
	}
	
}
