package com.springboot.jpa.repo;

import org.springframework.data.repository.CrudRepository;

import com.springboot.jpa.entities. User;

public interface UserRespository extends CrudRepository<User, Integer> {

}
