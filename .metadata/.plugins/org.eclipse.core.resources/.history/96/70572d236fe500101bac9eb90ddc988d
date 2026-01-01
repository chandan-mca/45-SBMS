package in.ashokit.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import in.ashokit.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	// select * from employee where emp_country='India';
	public List<Employee> findByEmpCountry(String country);

	// select * from employee where emp_gender='Male';
	public List<Employee> findByEmpGender(String gender);

	// select * from employee where emp_gender='Male' and emp_country='India';
	public List<Employee> findByEmpGenderAndEmpCountry(String gender, String country);

	// select * from employee where emp_salary > 5000;
	public List<Employee> findByEmpSalaryGreaterThan(Double salary);

}
