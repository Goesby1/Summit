package com.example.demoSpringDI.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee5")
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
int id;
String empName;
String empEmail;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmpEmail() {
	return empEmail;
}
public void setEmpEmail(String empEmail) {
	this.empEmail = empEmail;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name:"+empName+" Email: "+empEmail;
	}
}
