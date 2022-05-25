package com.awsassignment.configuration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.awsassignment.pojo.Bank;
@Configuration
@ComponentScan(basePackages={"com.awsassignment.service.BankService"})
@EnableJpaRepositories({"com.awsassignment.repository.BankRepository"})
@EntityScan({"com.awsassignment.pojo.Bank"})
public class BankConfiguration {
	@Bean
	public Bank bankcreate() {
		return new Bank();
	}



}
