package com.awsassignment.configuration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.services.s3.AmazonS3;
import com.awsassignment.dao.BankDao;
import com.awsassignment.dao.BankDaoImpl;
import com.awsassignment.pojo.Bank;
import com.awsassignment.repository.BankRepository;
import com.awsassignment.service.BankService;
@Configuration
@EnableAutoConfiguration
public class BankConfiguration {
	@Bean
	public Bank bankcreate() {
		return new Bank();
	}
	
	
	
}
