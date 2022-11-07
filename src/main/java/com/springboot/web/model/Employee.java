package com.springboot.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "employee_table")
public class Employee {
	@Id
	private Integer employeeNumber;
	private String employeeName;
	private String employeeDesignation;
	private String employeeLocation;
	private String employeeDepartement;
  
}
