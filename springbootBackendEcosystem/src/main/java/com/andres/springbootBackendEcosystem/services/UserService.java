package com.andres.springbootBackendEcosystem.services;

import java.util.List;

import com.andres.springbootBackendEcosystem.model.User;


public interface UserService {
    User saveUser(User user);
    List<User> fetchUserList();
    User updateUser(User user, Long userId);
    void deleteUserById(Long userId);
}
