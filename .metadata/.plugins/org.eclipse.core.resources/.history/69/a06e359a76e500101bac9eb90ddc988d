package in.ashokit.services;

import java.util.List;

import org.springframework.stereotype.Service;

import in.ashokit.entities.Employee;
import in.ashokit.repositories.EmployeeRepository;

@Service
public class EmployeeService {

	private EmployeeRepository employeeRepository;

	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	public void getAllEmployees() {
		List<Employee> allEmps = employeeRepository.getAllEmps();
		allEmps.forEach(System.out::println);
	}
	
	public void getEmployeesWithGender() {
		List<Employee> empsWithGender = employeeRepository.getEmpsWithGender("Male");
		empsWithGender.forEach(System.out::println);
	}
	
	public void getAllEmployeesWithSql() {
		List<Employee> allEmps = employeeRepository.getEmpsSQL();
		allEmps.forEach(System.out::println);
	}
	 

	
}
