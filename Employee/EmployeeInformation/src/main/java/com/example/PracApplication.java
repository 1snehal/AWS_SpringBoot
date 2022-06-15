package com.example;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan({"com.example.service","com.example.dao","com.example.controller"})
@EntityScan({"com.example.pojo"})
public class PracApplication {
	public static void main(String[] args) {
		SpringApplication.run(PracApplication.class, args);
		System.out.println("Hello");
	}
}
