package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeMapper;
import com.employee.model.Employee;
@Service
public class EmployeeServImpl implements EmployeeService {

	@Autowired
	EmployeeMapper emplDao;
	
	@Override
	public int saveEmployee(Employee employee) {
		emplDao.saveEmployee(employee);
		return 0;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> lis = emplDao.getAllEmployees();
		return lis;
	}


	@Override
	public Employee getEmployee(int empId) {
		Employee emp = emplDao.getEmployee(empId);
		return emp;
	}
	
	@Override
	public int update(Employee employee) {
		
		emplDao.updateEmployee(employee);
		return 0;
	}


	@Override
	public int deleteEmployee(int empId) {
		emplDao.deleteEmployee(empId);
		return 0;
	}

	

}
