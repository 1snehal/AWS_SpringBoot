package com.awsassignment.configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.awsassignment.pojo.Bank;
@Configuration
public class BankConfiguration {
	@Bean
	public Bank bankcreate() {
		return new Bank();
	}
}
