package com.awsassignment.app;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.awsassignment.service.BankService;
@SpringBootApplication
public class BankApp {
	public static void main(String[] args) {
		SpringApplication.run(BankApp.class, args);
		System.out.println("Hello");
	}
}
