package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {

	String addEmployee(Employee employee);
	String updateEmployee(Employee employee);
	String deleteEmployeeById(Integer id);
	Employee findEmployeeById(Integer id);
	List<Employee> findAllEmployee();
}
