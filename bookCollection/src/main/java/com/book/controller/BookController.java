package com.book.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.dao.BookDao;
import com.book.pojo.Book;
@RestController
@RequestMapping("/book")
public class BookController {
@Autowired
private BookDao bookdao;
@RequestMapping("/savebook")
public String addmybook(Book book) {
	bookdao.addbook(book);
	return "added successfully";
}
}
