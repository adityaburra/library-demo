package com.library.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.library.demo.entity.Book;
import com.library.demo.entity.User;
import com.library.demo.repository.BookRepository;

/**
 * Service deals with the transactions related to books
 * 
 * @author Aditya Burra
 *
 */
@Component
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	/**
	 * Returns the appropriate list of books based on the given userId
	 * 
	 * @param userId
	 *            - given userId
	 * @return books - all or filtered list of books based on the given user
	 */
	public List<Book> findBooks(Integer userId) {

		List<Book> books = new ArrayList<Book>();

		if (null == userId) {
			bookRepository.findAll().iterator().forEachRemaining(books::add);
		} else {
			books = bookRepository.findByUser(User.userFor(userId));
		}

		return books;
	}

}
