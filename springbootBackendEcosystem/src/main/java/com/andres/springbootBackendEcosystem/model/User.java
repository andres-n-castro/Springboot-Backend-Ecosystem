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
  private int id;
  private String fullName;
  private String email;
  private String hashedPassword;

  protected User() {}

  public User(String fullName, String email, String password) {
    this.fullName = fullName;
    this.email = email;
    hashedPassword = password;
  }

  public int getID() {
    return id;
  }

  public String getFullName() {
    return fullName;
  }

  public String getEmail() {
    return email;
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
