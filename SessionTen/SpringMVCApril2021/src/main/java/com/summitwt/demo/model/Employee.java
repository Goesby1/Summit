package com.summitwt.demo.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Entity
@Table(name = "employee000")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
int id;
String name;
String email;
String location;
public Employee() {
	// TODO Auto-generated constructor stub
}
public Employee(int id,String name,String email,String location) {
	// TODO Auto-generated constructor stub
	this.id=id;
	this.email=email;
	this.name=name;
	this.location=location;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
}
