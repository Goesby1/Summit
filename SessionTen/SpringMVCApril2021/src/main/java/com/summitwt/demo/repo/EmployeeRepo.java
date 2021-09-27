package com.summitwt.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.summitwt.demo.model.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>
{

}
