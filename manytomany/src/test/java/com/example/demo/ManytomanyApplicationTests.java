package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Course;
import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepository;


@SpringBootTest
class ManytomanyApplicationTests {

	
	@Autowired
	StudentRepository studentRepo;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void createEntities() {
		
		Student student1 = new Student();
		student1.setAge(20);
		student1.setName("Yoseph");
		student1.setGrade("Sophmore");
		
		Set<Course> lst = new HashSet<Course>();
		Course course1 = new Course();
		course1.setFee(1200.00);
		course1.setModules(23);
		course1.setTitle("Physics");
		course1.setAbbr("PHY");
		
		Course course2 = new Course();
		course2.setFee(1200.00);
		course2.setModules(45);
		course2.setTitle("MATH");
		course2.setAbbr("MTH");
		
		lst.add(course1);
		lst.add(course2);
		
		student1.setStudents(lst);
		
		studentRepo.save(student1);
		
	}

}
