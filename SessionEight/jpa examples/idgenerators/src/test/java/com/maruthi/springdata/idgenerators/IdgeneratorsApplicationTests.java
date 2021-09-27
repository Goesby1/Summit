package com.maruthi.springdata.idgenerators;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.maruthi.springdata.idgenerators.entities.Employee;
import com.maruthi.springdata.idgenerators.repos.EmployeeRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IdgeneratorsApplicationTests {

	@Autowired
	EmployeeRepository er;

	@Test
	public void testCreateEployee() {

		Employee employee = new Employee();
		employee.setName("Maruthi1");

		er.save(employee);
	}
	

}
