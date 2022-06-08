package com.book.dao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.book.pojo.Book;
import com.book.repository.BookRepository;
@Component
public class BookDaoImpl implements BookDao{
	private BookRepository bookrepo;
	private Book books;
	public BookDaoImpl() {
	}
	@Autowired
	public BookDaoImpl(BookRepository bookrepo) {
		this.bookrepo = bookrepo;
	}
	@Override
	public Book addBook(Book book) {
		System.out.println(book);
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
	public Book updateBook(Book book) {
		books=bookrepo.findById(book.getBookid()).get();
		books.setBookid(book.getBookid());
		books.setBookname(book.getBookname());
		books.setBookprice(book.getBookprice());
		bookrepo.save(books);
		return bookrepo.save(books);
	}
}