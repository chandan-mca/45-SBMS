package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entities.Employee;
import in.ashokit.services.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		EmployeeService employeeService = context.getBean(EmployeeService.class);
		
		//pagination
		employeeService.getEmps(2);
		System.out.println("===============");		
		
		//Query by Example
		Employee employee = new Employee();
		employee.setEmpCountry("India");
		employee.setEmpGender("Male");
		employeeService.getEmpsWithQBE(employee);

		context.close();
	}

}
