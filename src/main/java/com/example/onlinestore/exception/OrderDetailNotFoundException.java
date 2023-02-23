package com.example.onlinestore.exception;

public class OrderDetailNotFoundException extends RuntimeException{
    public OrderDetailNotFoundException() {
    }

    public OrderDetailNotFoundException(String message) {
        super(message);
    }
}
