package in.ashokit.services;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import in.ashokit.entities.Employee;
import in.ashokit.repositories.EmployeeRepository;

@Service
public class EmployeeService {

	private static final int PAGE_SIZE = 3;

	private EmployeeRepository empRepo;

	public EmployeeService(EmployeeRepository empRepo) {
		this.empRepo = empRepo;
	}

	public void getEmps(int pageNum) {

		Pageable pageable = PageRequest.of(pageNum - 1, PAGE_SIZE);

		Page<Employee> emps = empRepo.findAll(pageable);

		emps.forEach(System.out::println);
	}

	public void getEmpsWithQBE(Employee emp) {

		Example<Employee> empEx = Example.of(emp);

		List<Employee> emps = empRepo.findAll(empEx);

		emps.forEach(System.out::println);
	}
}
