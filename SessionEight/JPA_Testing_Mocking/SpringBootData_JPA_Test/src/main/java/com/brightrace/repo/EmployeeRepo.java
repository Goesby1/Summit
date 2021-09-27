package com.brightrace.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brightrace.entity.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>
{
// 10 methods are available
}
