package com.cisco.jpa.test.dao;

import org.springframework.data.repository.CrudRepository;
import com.cisco.jpa.test.entities.User;
public interface UserRepo extends CrudRepository<User, Integer> {

}
