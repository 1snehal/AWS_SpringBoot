package com.awsassignment.app;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication
@EntityScan("com.awsassignment.app.pojo")
@EnableJpaRepositories(basePackages = {"com.awsassignment.app.repository"})
public class BankApp {
	public static void main(String[] args) {
		SpringApplication.run(BankApp.class, args);
		System.out.println("Hello");
	}
}
