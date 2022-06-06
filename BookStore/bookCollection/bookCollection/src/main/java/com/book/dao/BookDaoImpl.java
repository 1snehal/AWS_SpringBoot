package com.book.dao;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.book.pojo.Book;
import com.book.repository.BookRepository;
@Component
public class BookDaoImpl implements BookDao{
	@Autowired
	private BookRepository bookrepo;
	public BookDaoImpl() {
	}
	@PostConstruct
	public Book addbook(Book book) {
		return bookrepo.save(book);
	}
}