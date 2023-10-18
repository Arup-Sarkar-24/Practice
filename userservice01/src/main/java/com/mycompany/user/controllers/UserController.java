package com.mycompany.user.controllers;

import com.mycompany.user.entities.User;
import com.mycompany.user.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("user")
    public ResponseEntity<User> createUser(@RequestBody User user){
        User createdUser = userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }

    @GetMapping("user/{userId}")
    public ResponseEntity<User> getSingleUser(@PathVariable String userId){
        User user = userService.getUser(userId);
        return ResponseEntity.ok(user);
    }

    @GetMapping("users")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> allUsers = userService.getAllUsers();
        return ResponseEntity.ok(allUsers);
    }

    @PutMapping("user/{userId}")
    public ResponseEntity<User> updateUser(@PathVariable String userId, @RequestBody User updatedUser){
        User updated = userService.updateUser(userId, updatedUser);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("user/{userId}")
    public ResponseEntity<String> deleteUser(@PathVariable String userId){
        userService.deleteUser(userId);
        String message = "User with ID " + userId + " has been deleted.";
        return ResponseEntity.ok(message);
    }

}
