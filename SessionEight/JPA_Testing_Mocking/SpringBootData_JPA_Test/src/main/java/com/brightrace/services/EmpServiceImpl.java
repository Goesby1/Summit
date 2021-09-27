package com.brightrace.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.brightrace.repo.EmployeeRepo;
import com.brightrace.entity.*;

@Service
public class EmpServiceImpl implements EmpService
{
	@Autowired
	EmployeeRepo empRepo;
	
	@Transactional
	@Override
	public int getDetails() {
	List<Employee> list = empRepo.findAll();
	int s=list.size();
	// make new list
	// update 
	
	//System.out.println(list);
	//System.out.println("serivce get details methods");
	//System.out.println(list);
	return s;
}
	public void getData()
	{
		System.out.println("getting emp data...");
	}
}
