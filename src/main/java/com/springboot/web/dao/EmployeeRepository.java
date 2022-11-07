package com.springboot.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.web.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
