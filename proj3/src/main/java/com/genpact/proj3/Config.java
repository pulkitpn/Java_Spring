package com.genpact.proj3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.genpact.proj3")
public class Config {
	
	@Bean
	public Employee getEmployee() {
		return new EmployeeImp();
	}

}
