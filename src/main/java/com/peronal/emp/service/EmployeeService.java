package com.peronal.emp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peronal.emp.dao.EmployeeDao;
import com.peronal.emp.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	public Employee getEmployee(int id) {
		return employeeDao.getEmployee(id);
	}

}
