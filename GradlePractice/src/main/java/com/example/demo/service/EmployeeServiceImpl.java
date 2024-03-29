package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public String addEmployee(Employee employee) {
		employeeRepository.save(employee);
		return "Employee added successfully";
	}

	@Override
	public String updateEmployee(Employee employee) {
		employeeRepository.save(employee);
		return  "Employee updated successfully";
	}

	@Override
	public String deleteEmployeeById(Integer id) {
		employeeRepository.deleteById(id);
		return  "Employee deleted successfully";
	}

	@Override
	public Employee findEmployeeById(Integer id) {
		Optional<Employee> employee = employeeRepository.findById(id);
		return employee.get();
	}

	@Override
	public List<Employee> findAllEmployee() {
		return employeeRepository.findAll();
	}

}
