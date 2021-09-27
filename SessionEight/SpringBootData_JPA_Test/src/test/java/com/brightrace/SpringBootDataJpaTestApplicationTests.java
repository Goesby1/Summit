package com.brightrace;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.brightrace.entity.Employee;
import com.brightrace.repo.EmployeeRepo;

@SpringBootTest
class SpringBootDataJpaTestApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	EmployeeRepo empRepo;
	@Test
	public void testEmployeeSave()
	{
		Employee e = new Employee();
		e.setEmpEmail("maruthi@summitworks.com");
		e.setEmpName("Maruthi");
		
		empRepo.save(e);
		System.out.println("data stord in db tabled");
		//empRepo.
	}

}
