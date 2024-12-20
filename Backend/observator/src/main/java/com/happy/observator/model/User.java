package com.happy.observator.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "users")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    private String username;

    @NotBlank
    private String password;

    private String email;
    private String phone = "";
    private String upbitAccessKey;
    private String upbitSecretKey;
    private boolean upbitKeysSet;
    private int emailAgreed;

    public User() {}
    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String username, String password, String email, String phone) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;

    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phone;
    }

    public void setPhoneNumber(String phone) {
        this.phone = phone;
    }

    public String getUpbitAccessKey() {
        return this.upbitAccessKey;
    }

    public void setUpbitAccessKey(String upbitAccessKey) {
        this.upbitAccessKey = upbitAccessKey;
    }

    public String getUpbitSecretKey() {
        return this.upbitSecretKey;
    }

    public void setUpbitSecretKey(String upbitSecretKey) {
        this.upbitSecretKey = upbitSecretKey;
    }

    public boolean isUpbitKeysSet() {
        return this.upbitKeysSet;
    }

    public void setUpbitKeysSet(boolean upbitKeysSet) {
        this.upbitKeysSet = upbitKeysSet;
    }

    public int getEmailAgreed() {
        return emailAgreed;
    }

    public void setEmailAgreed(int emailAgreed) {
        this.emailAgreed = emailAgreed;
    }
}
