package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Employee;
import com.example.demo.repos.EmployeeRepo;

@SpringBootTest
class Demo1ApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	EmployeeRepo empRepo;
	
	@Test
	void addEmp()
	{
		Employee e = new Employee();
		e.setId(2);
		e.setEmpName("Mar2");
		e.setEmpEmail("mar2@gmail.com");
		empRepo.save(e);
		System.out.println("data has been stored ");		
	}

}
