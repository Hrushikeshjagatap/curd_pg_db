package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.repositry.EmployeeRepositry;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

	@Autowired
	private EmployeeRepositry employeeRepositry;
	
	
	@GetMapping("/get")
	public List<Employee> getAllemp(){
		return this.employeeRepositry.findAll();
	}
	
	@PostMapping("/post")
	public Employee createEmp(@RequestBody Employee employee) {
		return this.employeeRepositry.save(employee);
	}
	
	
}
