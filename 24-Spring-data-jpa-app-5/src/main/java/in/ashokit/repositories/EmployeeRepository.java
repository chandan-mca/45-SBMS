package in.ashokit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	

}
