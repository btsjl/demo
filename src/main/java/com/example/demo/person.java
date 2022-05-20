package com.example.demo;

public class person {
    private  String user;
    private String password;
    public person(String user, String password) {
        this.user = user;
        this.password=password;
    }

    public byte[] getUserb() {
        return user.getBytes();
    }

    public byte[] getPasswordb() {
        return password.getBytes();
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

}
