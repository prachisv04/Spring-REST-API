package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController

public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return service.getAllEmployees();
	}
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@RequestBody Employee emp) {
			service.saveEmployee(emp);
			return "Employee saved";
	}
	

}
