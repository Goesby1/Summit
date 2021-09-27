package com.example.demoSpringDI;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.*;
import com.example.demoSpringDI.model.Employee;
import com.example.demoSpringDI.repo.*;

@SpringBootTest
class SpringDataJpaeXample1ApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	EmployeeRepo empRepo;
	@Test
	public void saveEmp()
	{
		Employee e = new Employee();
		e.setEmpEmail("Maruthi5@gmail.com");
		e.setEmpName("Maruthi5");
		//e.setId(99993);
		
		empRepo.save(e);
		System.out.println("saved one record in db table...");
	}
	/*@Test
	public void getAllmployee()
	{
		
		List<Employee> list = empRepo.findAll();
		System.out.println(list.size());
		System.out.println(list);
	}
	@Test
	public void deleteEmp()
	{
		empRepo.deleteById(99992);
		System.out.println("deleted now...");
	}*/
	// many test classes...

}
