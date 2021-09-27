package com.maruthi.springdata.idgenerators.repos;

import org.springframework.data.repository.CrudRepository;

import com.maruthi.springdata.idgenerators.entities.Employee;


public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}