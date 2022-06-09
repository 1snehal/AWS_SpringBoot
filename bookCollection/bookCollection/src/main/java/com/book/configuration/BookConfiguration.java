package com.book.configuration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.book.pojo.Book;
@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.book.dao","com.book.service","com.book.controller"})
public class BookConfiguration {
	@Bean
	public Book createbook() {
		return new Book();
	}
}
