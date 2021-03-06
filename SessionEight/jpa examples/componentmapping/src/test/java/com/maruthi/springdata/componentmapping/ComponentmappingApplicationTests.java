package com.maruthi.springdata.componentmapping;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.maruthi.springdata.componentmapping.entities.Address;
import com.maruthi.springdata.componentmapping.entities.Employee;
import com.maruthi.springdata.componentmapping.repos.EmployeeRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ComponentmappingApplicationTests {

	@Autowired
	EmployeeRepository repository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testCreate() {
		Employee employee = new Employee();
		employee.setId(123);
		employee.setName("Bharath");
		Address address = new Address();
		address.setCity("Austin");
		address.setStreetaddress("Spicewood Springs");
		address.setCountry("USA");
		address.setState("TEXAS");
		address.setZipcode("78750");
		employee.setAddress(address);
		
		repository.save(employee);
	}
}
