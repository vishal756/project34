package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IEmployeeDao;
import com.example.demo.entity.Employee;

@Service
public class EmployeeImp1Service implements IEmployeeService {
	
	@Autowired
	IEmployeeDao empDao;

	@Override
	public Employee addEmployee(Employee employee) {
		Employee emp=empDao.save(employee);
		return emp;
	}

	@Override
	public Employee deleteEmployee(int empId) {
		
		return null;
	}

	@Override
	public Employee getEmployeeById(int empId) {
		return null;
	}

}
