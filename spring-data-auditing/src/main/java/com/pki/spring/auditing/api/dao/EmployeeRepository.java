package com.pki.spring.auditing.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pki.spring.auditing.api.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
