package com.brightrace.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brightrace.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>
{
// 10 methods are avaible
}
