package com.peronal.emp.dao;

import org.springframework.stereotype.Repository;

import com.peronal.emp.model.Employee;

@Repository
public class EmployeeDao {

	public Employee getEmployee(int id) {
		Employee employee = new Employee();
		return employee;
	}

}
