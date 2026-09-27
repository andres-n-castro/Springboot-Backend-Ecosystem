package com.andres.springbootBackendEcosystem.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "Users")
public class User {
  @Id 
  @GeneratedValue(strategy=GenerationType.UUID)
  private UUID id;
  private String fullName;
  private String email;
  private String hashedPassword;

  protected User() {}

  public User(String fullName, String email, String hashedPassword) {
    this.fullName = fullName;
    this.email = email;
    this.hashedPassword = hashedPassword;
  }

  public UUID getId() {
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
