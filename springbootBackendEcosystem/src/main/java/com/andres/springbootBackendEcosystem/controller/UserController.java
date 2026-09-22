package com.andres.springbootBackendEcosystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.andres.springbootBackendEcosystem.model.UserResponse;

@RestController 
public class UserController {

    @GetMapping("/user")
    public UserResponse getUser() {
        return new UserResponse(1, "Andres", 22);
    }
    
}
