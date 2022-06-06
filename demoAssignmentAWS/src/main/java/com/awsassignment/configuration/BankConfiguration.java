package com.awsassignment.configuration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.awsassignment.dao.BankDao;
import com.awsassignment.dao.BankDaoImpl;
import com.awsassignment.pojo.Bank;
@Configuration
@ComponentScan(basePackages = {"com.awsassignment.dao","com.awsassignment.service"})
@EnableAutoConfiguration
@EntityScan("com.awsassignment.pojo")
@EnableJpaRepositories(basePackages = {"com.awsassignment.repository"})
public class BankConfiguration {
	@Bean
	public Bank bankcreate() {
		return new Bank();
	}
	@Bean
	BankDao bankdaoimpl() {
		return new BankDaoImpl();
	}

}
