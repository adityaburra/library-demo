package com.library.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.library.demo.entity.Book;
import com.library.demo.entity.User;

/**
 * Interface for custom & CRUD operations on a Book entity
 * 
 * @author Aditya Burra
 *
 */
public interface BookRepository extends CrudRepository<Book, Integer> {

	/**
	 * Returns the books lent to the given user
	 * 
	 * @param user
	 *            - persistence entity
	 * @return bookList - list of books lent to the given user
	 */
    List<Book> findByUser(User user);

}
