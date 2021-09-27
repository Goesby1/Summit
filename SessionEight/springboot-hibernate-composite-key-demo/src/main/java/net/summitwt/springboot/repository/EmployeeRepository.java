package net.summitwt.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.summitwt.springboot.entity.Employee;
import net.summitwt.springboot.entity.EmployeeIdentity;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, EmployeeIdentity> {

	/*
	 * Spring Data JPA will automatically parse this method name and create a query
	 * from it
	 */
	//List<Employee> findByEmployeeIdentityCompanyId(String companyId);
}
