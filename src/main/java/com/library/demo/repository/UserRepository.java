package com.library.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.library.demo.entity.User;

/**
 * Interface for CRUD operations on a User entity
 * 
 * @author Aditya Burra
 *
 */
public interface UserRepository extends CrudRepository<User, Integer> {

}
