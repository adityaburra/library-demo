package com.library.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.library.demo.entity.User;
import com.library.demo.repository.UserRepository;

/**
 * Service deals with the transactions related to users
 * 
 * @author Aditya Burra
 *
 */
@Component
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> findAllUsers() {

		List<User> users = new ArrayList<User>();

		userRepository.findAll().iterator().forEachRemaining(users::add);

		return users;
	}

}
