package com.library.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.library.demo.service.BookService;

/**
 * Controller to deal with the requests for the retrieval of books
 * 
 * @author Aditya Burra
 *
 */
@Controller
public class BooksController {

	private static final String FRAGMENT_IDENTIFIER = " :: booksLent";

	private static final String BOOKS = "books";

	@Autowired
	private BookService bookService;

	/**
	 * Retrieves all or appropriate list of books based on the given request param
	 * 
	 * @param userId
	 *            - this is an optional request param
	 * @param model
	 *            - holds the model attributes
	 * @return view - the name of the page to be rendered
	 */
	@RequestMapping(path = "/books", method = RequestMethod.GET)
	public String retriveBooks(@RequestParam(value = "userId", required = false) Integer userId, Model model) {
		model.addAttribute(BOOKS, bookService.findBooks(userId));
		return decideView(userId);
	}

	/**
	 * Formulate the resultant view name
	 * 
	 * @param userId
	 *            - the user identifier for which books need to be retrieved
	 *            (optional value)
	 * @return view - resultant view name, appended with fragment identifier
	 *         when appropriate
	 */
	private String decideView(Integer userId) {
		String view = BOOKS;

		if (userId != null) {
			view += FRAGMENT_IDENTIFIER;
		}

		return view;
	}

}
