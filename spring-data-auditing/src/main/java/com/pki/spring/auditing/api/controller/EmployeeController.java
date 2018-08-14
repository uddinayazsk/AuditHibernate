package com.pki.spring.auditing.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pki.spring.auditing.api.dto.InputRequest;
import com.pki.spring.auditing.api.model.Employee;
import com.pki.spring.auditing.api.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService service;

	@PostMapping("/addEmployee")
	public String saveEmployee(@RequestBody InputRequest<Employee> request) {

		return service.saveEmployee(request);
	}
	@PutMapping("/updateEmployee/{id}/{salary}")
	public String updateEmployeeSalary(@PathVariable int id,@PathVariable double salary,InputRequest<Employee> request) {
		service.updateEmployee(id, salary, request);
		return null;
		
	}

}
