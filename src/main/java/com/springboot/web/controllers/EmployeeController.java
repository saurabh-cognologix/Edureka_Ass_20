package com.springboot.web.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web.model.Employee;
import com.springboot.web.services.EmployeeServices;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	private EmployeeServices employeeServices;
	
	@PostMapping("/employee/add")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
		Employee employee1 = null;
		try {
			employee1 = this.employeeServices.addEmployee(employee);
			return ResponseEntity.of(Optional.of(employee1));
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	//get all the employee details
	@GetMapping("/employee/get")
	public ResponseEntity<List<Employee>> getAllEmployee(){
		 List<Employee> employeeList =this.employeeServices.getAllEmployee();
		 if(employeeList.size() <= 0) {
			 return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		 }else {
			 return ResponseEntity.of(Optional.of(employeeList));
		 }
	}
}
