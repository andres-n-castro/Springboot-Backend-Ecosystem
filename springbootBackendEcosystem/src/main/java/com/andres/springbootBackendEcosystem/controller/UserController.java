package com.andres.springbootBackendEcosystem.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.andres.springbootBackendEcosystem.model.User;
import com.andres.springbootBackendEcosystem.services.UserService;

import jakarta.validation.Valid;

/*This Controller will contain the endpoints for the User resource */

@RestController 
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public List<User> fetchUserList() {
        return userService.fetchUserList();
    }

    @PostMapping("/user")
    public User saveUser(@Valid @RequestBody User user) {
        return userService.saveUser(user);
    }

    @PutMapping("/user/{user_id}")
    public User updateUserById(@RequestBody User user, @PathVariable("user_id") Long userId) {
        return userService.updateUser(user, userId);
    }

    @DeleteMapping("/user/{user_id}")
    public String deleteUserById(@PathVariable("user_id") Long userId) {
        userService.deleteUserById(userId);
        return "user deleted successfully";
    }
    
}
