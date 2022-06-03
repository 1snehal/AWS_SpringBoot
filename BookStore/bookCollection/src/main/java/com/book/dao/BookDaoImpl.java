package com.book.dao;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.book.pojo.Book;
import com.book.repository.BookRepository;
@Component
public class BookDaoImpl implements BookDao{
	private BookRepository bookrepo;
	public BookDaoImpl() {
	}
	@Autowired
	public BookDaoImpl( BookRepository bookrepo) {
		this.bookrepo = bookrepo;
	}
	@PostConstruct
	public Book addbook(Book book) {
		bookrepo.save(book);
		return book;
	}
}