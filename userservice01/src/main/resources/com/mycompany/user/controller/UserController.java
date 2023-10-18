package com.mycompany.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mycompany.user.entities.User;
import com.mycompany.user.services.UserService;.

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	// create

	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User user1 = userService.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
	}

	// all user get
	@GetMapping("/users")
	public ResponseEntity<List<User>> getAllUser() {
		List<User> allUser = userService.getAllUser();
		return ResponseEntity.ok(allUser);
	}

	// single user get

	@GetMapping("/user/{userId}")
	public ResponseEntity<User> getSingleUser(@PathVariable String userId) {
		User user = userService.getUser(userId);
		return ResponseEntity.ok(user);
	}

}
