package com.book.dao;
import java.util.List;
import org.springframework.stereotype.Component;
import com.book.pojo.Book;
@Component
public interface BookDao {
	Book addBook(Book book );
	void deleteBook(int bid);
	void deleteAllBook();
	List<Book> allBooks();
	Book updateBook(Book book);
}
