package com.dinner.dinner;

public class Users {

    private String name;
    private String password;
    private String email;


    public Users(String name, String email, String password) {
        this.name = name;
        this.password = password;
        this.email = email;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

