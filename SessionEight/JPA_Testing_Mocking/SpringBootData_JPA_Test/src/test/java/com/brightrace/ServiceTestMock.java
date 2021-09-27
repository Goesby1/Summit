package com.brightrace;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.brightrace.repo.EmployeeRepo;
import com.brightrace.services.EmpServiceImpl;

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
	assertEquals(2,empService.getDetails());
}
/*@Test
public void getData123()
{
	empService.getData();
}*/

}
