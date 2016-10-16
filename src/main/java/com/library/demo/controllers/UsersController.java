package com.library.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.library.demo.service.UserService;

/**
 * Controller to handle requests for users
 * 
 * @author Aditya Burra
 */
@Controller
public class UsersController {

	private static final String USERS = "users";

	@Autowired
	private UserService userService;

	/**
	 * Retrieves all the library users
	 * 
	 * @param model
	 *            - holder for model attributes
	 * @return view - the page name for the view to be rendered
	 */
	@RequestMapping(path = "/users", method = RequestMethod.GET)
	public String retrieveUsers(Model model) {
		model.addAttribute(USERS, userService.findAllUsers());
		return USERS;
	}

}
