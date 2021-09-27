package com.example.demo.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

@Entity
@Table(name = "student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int age;
	private String grade;
	private String name;
	@ManyToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinTable(name = "students_courses", 
		joinColumns = @JoinColumn(name = "student_id", referencedColumnName="id"), inverseJoinColumns = @JoinColumn(name = "course_id", referencedColumnName="id"))
	private Set<Course> courses;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	public Set<Course> getCourses() {
		return courses;
	}
	public void setStudents(Set<Course> courses) {
		this.courses = courses;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", grade=" + grade + ", name=" + name + ", students=" + courses
				+ "]";
	}

}
