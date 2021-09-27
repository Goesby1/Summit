package com.example.demoSpringDI.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoSpringDI.model.*;
// Persistent logic
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>
{
// lot of code, customize, our own methods
	}
