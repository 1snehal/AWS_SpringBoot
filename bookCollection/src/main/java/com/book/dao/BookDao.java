package com.book.dao;
import org.springframework.stereotype.Repository;

import com.book.pojo.Book;
@Repository
public interface BookDao {
Book addbook(Book book );
}
