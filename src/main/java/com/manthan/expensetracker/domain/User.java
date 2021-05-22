package com.manthan.expensetracker.domain;

public class User {
    private Integer userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    public  User(Integer userId, String firstName, String lastName, String email, String password) {
        this.email = email;
        this.password = password;
        this.lastName = lastName;
        this.firstName = firstName;
        this.userId = userId;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getPassword() {
        return password;
    }
    public Integer getUserId() {
        return userId;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
