package com.example.demo.service;

import com.example.demo.entity.Employee;

public interface IEmployeeService {
	//Employee addEmployee(Employee employee);
	Employee deleteEmployee(int empId);
	Employee getEmployeeById(int empId);
	Employee addEmployee(Employee employee);
	

}
