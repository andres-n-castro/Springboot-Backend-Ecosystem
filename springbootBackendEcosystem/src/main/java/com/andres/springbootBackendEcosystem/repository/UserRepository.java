package com.andres.springbootBackendEcosystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.andres.springbootBackendEcosystem.model.User;
//import and extend the jpaRepository interface

@Repository 
public interface UserRepository extends JpaRepository<User, Long>{}
