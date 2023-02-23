package com.example.onlinestore.exception;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException() {
    }

    public ProductNotFoundException(String message) {
        super(message);
    }
}
