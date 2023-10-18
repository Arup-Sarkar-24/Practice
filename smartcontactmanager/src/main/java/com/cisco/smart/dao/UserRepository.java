package com.cisco.smart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cisco.smart.entities.User;

public interface UserRepository extends JpaRepository<User , Integer>{
	
}
