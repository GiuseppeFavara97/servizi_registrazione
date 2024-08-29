package com.example.servizi_registrazione.services;

public class CustomError extends RuntimeException {
    public CustomError(String message) {
        super(message);
    }
}