package com.example.demoSpringDI;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demoSpringDI.repo.EmployeeRepo;
import com.example.demoSpringDI.service.EmpServiceImpl;

@SpringBootTest
public class ServiceTestMock {

	@Mock
	EmployeeRepo empRepo;
	
	@InjectMocks
	@Autowired
	EmpServiceImpl empService;
	
	@Test
	public void testServiceMethod()
	{
		//System.out.println(empService.getEmployee(9999));
		//assertEquals(expected, actual);
		//empService.deleteEmpId(9999);
		System.out.println(empService.getCount());
		assertEquals(20, empService.getCount());
	}
}
