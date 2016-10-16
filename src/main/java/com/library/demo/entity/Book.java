package com.library.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

/**
 * Persistence entity
 * 
 * @author Aditya Burra
 *
 */
@Entity
@Table(name = "Library_BOOKS")
@Data
public class Book {

	@Id
	@Column(name = "ID")
	private Integer id;

	@Column(name = "TITLE")
	private String title;

	@Column(name = "AUTHOR")
	private String author;

	@Column(name = "ISBN")
	private String isbn;

	@ManyToOne
	@JoinTable(name = "LIBRARY_BOOKS_LENT", joinColumns = @JoinColumn(name = "BOOK_ID", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "USER_ID", referencedColumnName = "ID"))
	private User user;
}