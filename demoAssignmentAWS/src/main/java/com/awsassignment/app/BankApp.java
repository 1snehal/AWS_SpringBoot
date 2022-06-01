package com.awsassignment.app;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication
@ComponentScan(basePackages = {"com.awsassignment.dao","com.awsassignment.service"})
@EntityScan("com.awsassignment.pojo")
@EnableJpaRepositories(basePackages = {"com.awsassignment.repository"})
public class BankApp {
	public static void main(String[] args) {
		SpringApplication.run(BankApp.class, args);
		System.out.println("Hello");
	}
}
