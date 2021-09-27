package com.maruthi.springdata.componentmapping.repos;

import org.springframework.data.repository.CrudRepository;

import com.maruthi.springdata.componentmapping.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
