package com.awsassignment.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class},scanBasePackages={"com.assign.springboot.BankRepository"})
public class BankApp {
	public static void main(String[] args) {
		SpringApplication.run(BankApp.class, args);
		System.out.println("Hello");
}
}
