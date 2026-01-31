package in.ashokit.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table
public class Employee {
	
	@Id
	private Integer empId;
	
	private String empName;
	
	private Double empSalary;
	
	private String empGender;
	
	private String empCountry;

}
