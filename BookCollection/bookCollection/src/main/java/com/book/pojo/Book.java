package com.book.pojo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="bookcollection")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int bookid;
	String bookname;
	int bookprice;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getBookprice() {
		return bookprice;
	}
	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", bookprice=" + bookprice + "]";
	}
	public Book() {

	}
	public Book(int bookid, String bookname, int bookprice) {
		this.bookid = bookid;
		this.bookname = bookname;
		this.bookprice = bookprice;
	}

}
