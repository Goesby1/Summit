package com.summitwt.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.summitwt.demo.model.*;
import com.summitwt.demo.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo empRepo;
public List<Employee> getEmployeeList()
{
	return empRepo.findAll();
}
public void delete(int id)
{
	empRepo.deleteById(id);
}
public Employee get(int i)
{
	return empRepo.findById(i).get();
}
public void saveEmp(Employee e)
{
	empRepo.save(e);
}
}
