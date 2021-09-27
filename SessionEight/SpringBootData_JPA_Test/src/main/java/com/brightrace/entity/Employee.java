package com.brightrace.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp123")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	String empName;
	String empEmail;
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public String getEmpName() {
		return empName;
	}
	public int getId() {
		return id;
	}
	

}
