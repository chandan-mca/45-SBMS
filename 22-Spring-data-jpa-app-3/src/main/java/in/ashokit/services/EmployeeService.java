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

	public void saveEmployee() {

		Employee employee = new Employee();
		employee.setEmpId(106);
		employee.setEmpName("Rani");
		employee.setEmpSalary(26000.00);
		employee.setEmpGender("Female");
		employee.setEmpCountry("India");

		employeeRepository.save(employee);
		System.out.println("Employee data saved....");
	}

	public void getAllEmployees() {
		Iterable<Employee> empList = employeeRepository.findAll();
		// empList.forEach(System.out::println);

		empList.forEach(e -> {
			System.out.println(e);
		});
	}

	public void getEmployeesWithCountry() {
		List<Employee> emps = employeeRepository.findByEmpCountry("India");
		emps.forEach(System.out::println);
	}

	public void getEmployeesWithGender() {
		List<Employee> emps = employeeRepository.findByEmpGender("Male");
		emps.forEach(System.out::println);
	}

	public void getEmployeesWithGenderAndCountry() {
		List<Employee> emps = employeeRepository.findByEmpGenderAndEmpCountry("Male", "India");
		emps.forEach(System.out::println);
	}

	public void getEmployeesBasedOnSalary() {
		List<Employee> emps = employeeRepository.findByEmpSalaryGreaterThan(5000.00);
		emps.forEach(System.out::println);
	}
}
