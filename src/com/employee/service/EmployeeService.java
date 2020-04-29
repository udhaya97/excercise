package com.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.model.Employee;

@Service
public interface EmployeeService {
	
	int update(Employee employee);
	Employee getEmployee (int empId);
	int deleteEmployee (int empId);
	int saveEmployee(Employee employee);
	List<Employee> getAllEmployees();
	

}
