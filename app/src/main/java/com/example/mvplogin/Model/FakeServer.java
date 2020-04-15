package com.example.mvplogin.Model;

public class FakeServer {

    private static final String USERNAME = "Ahmed";
    private static final String PASSWORD = "1234";

    public boolean shouldLogin(String username, String password) {
        return USERNAME.equals(username) && PASSWORD.equals(password);

    }
}
