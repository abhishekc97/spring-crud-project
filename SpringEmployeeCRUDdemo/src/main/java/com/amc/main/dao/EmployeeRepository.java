package com.amc.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amc.main.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// that's it . JpaRepository gives me all the implementations needed.
	
}
