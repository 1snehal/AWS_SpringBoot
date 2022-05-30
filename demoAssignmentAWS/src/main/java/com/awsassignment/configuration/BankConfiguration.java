package com.awsassignment.configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.awsassignment.dao.BankDao;
import com.awsassignment.dao.BankDaoImpl;
import com.awsassignment.pojo.Bank;
import com.awsassignment.service.BankService;
@Configuration
public class BankConfiguration {
	@Bean
	public Bank bankcreate() {
		return new Bank();
	}
	@Bean
	public BankDaoImpl bankimplgenerate() {
		return new BankDaoImpl();
	}
	@Bean
	public BankService bankservices() {
		return new BankService();
	}
}
