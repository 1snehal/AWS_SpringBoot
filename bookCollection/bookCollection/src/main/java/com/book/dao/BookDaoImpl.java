package com.book.dao;
import java.util.List;
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
	public BookDaoImpl(BookRepository bookrepo) {
		this.bookrepo = bookrepo;
	}
	@Override
	public Book addBook(Book book) {
		return bookrepo.save(book);
	}
	@Override
	public void deleteBook(int bid) {
		bookrepo.deleteById(bid);
	}
	@Override
	public void deleteAllBook() {
		bookrepo.deleteAll();
	}
	@Override
	public List<Book> allBooks() {
		return bookrepo.findAll();
	}
	@Override
	public Book updateBook(int bid,Book book) {
		 return bookrepo.save(book);
	}
}