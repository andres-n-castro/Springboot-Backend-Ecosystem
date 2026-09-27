package com.andres.springbootBackendEcosystem.services;

import java.util.List;
import java.util.UUID;

import com.andres.springbootBackendEcosystem.model.User;


public interface UserService {
    User saveUser(User user);
    List<User> fetchUserList();
    User updateUser(User user, UUID userId);
    void deleteUserById(UUID userId);
}
