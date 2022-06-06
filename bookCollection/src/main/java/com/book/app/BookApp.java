package com.book.app;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.book.dao.BookDaoImpl;
import com.book.pojo.Book;
@SpringBootApplication
@EnableJpaRepositories({"com.book.repository"})
@EntityScan("com.book.pojo")
public class BookApp {
public static void main(String[] args) {
	SpringApplication.run(BookApp.class, args);
	System.out.println("hello");
	}
}
