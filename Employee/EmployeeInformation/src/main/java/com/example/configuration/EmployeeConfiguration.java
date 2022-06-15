package com.example.configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.pojo.Employee;
@Configuration
public class EmployeeConfiguration {
	@Bean
	public Employee empcreate() {
		return new Employee();
	}
}
