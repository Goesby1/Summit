package net.summitwt.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.summitwt.springboot.entity.Employee;
import net.summitwt.springboot.entity.EmployeeIdentity;
import net.summitwt.springboot.repository.EmployeeRepository;

@SpringBootApplication
public class SpringbootHibernateCompositeKeyDemoApplication implements CommandLineRunner
{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootHibernateCompositeKeyDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// clear up all the tables
		//employeeRepository.deleteAllInBatch();
		
		// employee object and insert in database
		Employee employee = new Employee(new EmployeeIdentity("E1", "C1"), "abcd","abcd@gmail.com", "888");
		
		employeeRepository.save(employee);
		
		/*Employee employee1 = new Employee(new EmployeeIdentity("E1", "C1"), "abcd",
				"abcd@gmail.com", "9999999999");
		
		employeeRepository.save(employee1);
	
		*/
		
		// Retrieving an Employee Record with the composite primary key
		
	//	employeeRepository.findById(new EmployeeIdentity("E-100", "C-1001"));
	}

}
