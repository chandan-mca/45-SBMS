package in.ashokit.services;

import java.util.List;

import org.springframework.data.domain.Sort;
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
//		List<Employee> all = employeeRepository.findAll();
		
		List<Employee> all = employeeRepository.findAll(Sort.by("empName").ascending());
		all.forEach(System.out::println);
	}
		
}
