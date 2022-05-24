package com.awsassignment.app;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication(scanBasePackages={"com.awsassignment.repository.BankRepository"})
@ComponentScan(basePackages={"com.awsassignment.service.BankService"})
public class BankApp {
	public static void main(String[] args) {
		SpringApplication.run(BankApp.class, args);
		System.out.println("Hello");
	}
}
