package com.book.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.book.dao.BookDao;
import com.book.pojo.Book;
@RestController
@RequestMapping("/book")
public class BookController {
	private BookDao bookdao;
	@Autowired
	public BookController(BookDao bookdao) {
		this.bookdao = bookdao;
	}
	@RequestMapping("/savebook")
	public String addmybook(@RequestBody Book book) {
		bookdao.addBook(book);
		return "added successfully";
	}
	@RequestMapping("/deletebook/{bid}")
	public String deletebook(@PathVariable int bid) {
		bookdao.deleteBook(bid);
		return "deleted successfully";
	}
	@RequestMapping("/deleteallbook")
	public String deleteallbooks() {
		bookdao.deleteAllBook();
		return "deleted successfully";
	}
	@RequestMapping("/booklist")
	public List<Book> booklist(){
		List<Book> li=bookdao.allBooks();
		return li;
	}
	@RequestMapping("/updatebook")
	public String updatebook(@RequestBody Book book) {
		bookdao.updateBook(book);
		return "Updated successfully";
	}
}
