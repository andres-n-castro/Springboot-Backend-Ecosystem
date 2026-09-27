package com.andres.springbootBackendEcosystem.services;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.andres.springbootBackendEcosystem.model.User;
import com.andres.springbootBackendEcosystem.repository.UserRepository;

@Service 
public class UserServiceImpl implements UserService{
 
    private final UserRepository userRepository; 

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //CREATE service
    @Override 
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    //GET service
    @Override 
    public List<User> fetchUserList() {
        return userRepository.findAll();
    }

    //UPDATE service
    @Override 
    public User updateUser(User user, UUID userId) {

        User retrievedUser = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        
        if (Objects.nonNull(user.getFullName()) && !"".equalsIgnoreCase(user.getFullName())) {
            retrievedUser.setFullName(user.getFullName());
        }

        if (Objects.nonNull(user.getEmail()) && !"".equalsIgnoreCase(user.getEmail())) {
            retrievedUser.setEmail(user.getEmail());
        }

        return userRepository.save(retrievedUser);

    }

    //DELETE service
    @Override 
    public void deleteUserById(UUID userId) {
        userRepository.deleteById(userId);
    }
}
