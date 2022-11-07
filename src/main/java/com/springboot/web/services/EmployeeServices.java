package com.springboot.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.web.dao.EmployeeRepository;
import com.springboot.web.model.Employee;

@Service
public class EmployeeServices {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	//adding employee
	public Employee addEmployee(Employee employee){
		employeeRepository.save(employee);
		return employee;
	}
	
	//get all the Employee
	public List<Employee> getAllEmployee(){
		return this.employeeRepository.findAll();
	}
   
	
}
