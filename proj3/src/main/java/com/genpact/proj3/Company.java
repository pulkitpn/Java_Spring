package com.genpact.proj3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {
	private Employee employee;
	
//	constructor based dependency injection
	
	@Autowired
	public Company(Employee employee) {
		super();
		this.employee = employee;
	}
	
	public void showEmployee() {
		employee.showEmployee();
		
	}
	
	

}
