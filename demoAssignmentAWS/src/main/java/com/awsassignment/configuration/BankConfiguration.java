package com.awsassignment.configuration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.awsassignment.pojo.Bank;
@Configuration
@ComponentScan(basePackages = {"com.awsassignment.dao","com.awsassignment.service"})
@EnableAutoConfiguration
public class BankConfiguration {
	@Bean
	public Bank bankcreate() {
		return new Bank();
	}

}
