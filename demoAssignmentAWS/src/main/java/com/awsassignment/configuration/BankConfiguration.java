package com.awsassignment.configuration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.awsassignment.dao.BankDaoImpl;
import com.awsassignment.pojo.Bank;
import com.awsassignment.repository.BankRepository;
import com.awsassignment.service.BankService;
@Configuration
@ComponentScan(basePackages={"com.awsassignment.service.BankService","com.awsassignment.dao.BankDaoImpl"})
@EnableJpaRepositories({"com.awsassignment.repository.BankRepository"})
@EntityScan({"com.awsassignment.pojo.Bank"})
public class BankConfiguration {
	@Bean
	public Bank bankcreate() {
		return new Bank();
	}
	@Bean
	public BankService bankservice() {
		return new BankService();
	}
	@Bean
	public BankDaoImpl bankimpl() {
		return new BankDaoImpl();
	}
}
