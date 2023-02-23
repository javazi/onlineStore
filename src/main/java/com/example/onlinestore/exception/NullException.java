package com.example.onlinestore.exception;

public class NullException extends NullPointerException{
    public NullException(){}

    public NullException(String message){
        super(message);
    }
}
