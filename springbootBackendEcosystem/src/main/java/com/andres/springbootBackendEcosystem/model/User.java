package com.andres.springbootBackendEcosystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "Users")
public class User {
  @Id 
  @GeneratedValue 
  private Long id;
  private String fullName;
  private String email;
  private String hashedPassword;

  protected User() {}

  public User(String fullName, String email, String password) {
    this.fullName = fullName;
    this.email = email;
    hashedPassword = password;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getFullName() {
    return fullName;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getEmail() {
    return email;
  }

  public void setHashedPassword(String hashedPassword) {
    this.hashedPassword = hashedPassword;
  }

  public String getHashedPassword() {
    return hashedPassword;
  }

  @Override 
  public String toString() {
    return String.format(
      "User[id: %d, fullname: %s, email: %s, hashedPassword: %s]", id, fullName, email, hashedPassword
    );
  }
}
