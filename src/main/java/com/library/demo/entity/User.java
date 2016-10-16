package com.library.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * Persistence entity
 * 
 * @author Aditya Burra
 *
 */
@Entity
@Table(name = "Library_USERS")
@Data
public class User {

	@Id
	@Column(name = "ID")
	private Integer id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "EMAIL_ADDRESS")
	private String email;

	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;

	public static User userFor(Integer id) {
		User user = new User();
		user.setId(id);
		return user;
	}
}
