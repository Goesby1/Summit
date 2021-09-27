package com.example.demoSpringDI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoSpringDI.model.Employee;
import com.example.demoSpringDI.repo.EmployeeRepo;

@Service
public class EmpServiceImpl implements EmpService
{
@Autowired
EmployeeRepo empRepo;
@Override
public void deleteEmpId(int id) {
	empRepo.deleteById(id);
	System.out.println("Deleted one record");
	//empRepo.getOne(2);
}
@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
	 return empRepo.getOne(id);
	}
@Override
	public long getCount() {
		// TODO Auto-generated method stub
		return empRepo.count();
	}
}
