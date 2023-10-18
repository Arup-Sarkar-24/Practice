package com.mycompany.user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.user.entities.User;
@Repository
public interface UserRepository extends JpaRepository<User, String>{
	//todo: implement custom method and query

}
