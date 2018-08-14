package com.pki.spring.auditing.api.service;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pki.spring.auditing.api.dao.EmployeeRepository;
import com.pki.spring.auditing.api.dto.InputRequest;
import com.pki.spring.auditing.api.model.Employee;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Service
@Data
@Getter
@Setter
public class EmployeeService {
	@Autowired
	EmployeeRepository repository;

	public String saveEmployee(InputRequest<Employee> request) {
		String currentuser = request.getLoggedInUser();
		request.setTimezone(Calendar.getInstance().getTimeZone().getDisplayName());
		Employee employee = request.getEmployee();
		 employee.setCreatedBy(currentuser);
		 
		repository.save(employee);
		return "Employee saved successfully";
	}

	public String updateEmployee(int id, double salary, InputRequest<Employee> request) {
		Employee employee = repository.findById(id).get();
		if (employee != null) {
			employee.setSalary(salary);
			employee.setModifiedBy(request.getLoggedInUser());
			repository.saveAndFlush(employee);
		} else {
			throw new RuntimeException("Employee not found with id :" + id);
		}
		return "Employee updated successfully";
	}

}
