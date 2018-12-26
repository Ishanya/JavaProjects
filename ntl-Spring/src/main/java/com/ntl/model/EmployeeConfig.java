package com.ntl.model;

import org.springframework.context.annotation.*;

@Configuration
public class EmployeeConfig {
	
	@Bean
	public Employee getEmployee() {
		Employee emp1=new Employee();
		emp1.setEmpId(2378);
		emp1.setEmpName("Bhanu");
		emp1.setSalary(65000);
		return emp1;
	}
	
	
	@Bean
	public Employee getEmployee2() {
		Employee emp2=new Employee();
		emp2.setEmpId(23789);
		emp2.setEmpName("BhanuK");
		emp2.setSalary(650000);
		return emp2;
	}
	
}
