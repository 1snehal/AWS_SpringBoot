package com.book.service;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.book.dao.BookDaoImpl;
import com.book.pojo.Book;
@Component
public class BookService {
	private BookDaoImpl bookimpl;
	@Autowired
	public BookService(BookDaoImpl bookimpl) {
		this.bookimpl = bookimpl;
	}
	@PostConstruct
	public String sum(Book book) {
		bookimpl.addbook( book);
		return "completed";
	}
}
