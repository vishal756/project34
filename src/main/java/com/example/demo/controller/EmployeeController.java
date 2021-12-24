package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.IEmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	IEmployeeService empService;
	@PostMapping("/employee/add")
	ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
		Employee emp=empService.addEmployee(employee);
		return new ResponseEntity<>(emp,HttpStatus.CREATED);
	}

}
