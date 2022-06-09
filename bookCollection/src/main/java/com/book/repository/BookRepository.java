package com.book.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.book.pojo.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{
	void deleteById(int bid);
}
