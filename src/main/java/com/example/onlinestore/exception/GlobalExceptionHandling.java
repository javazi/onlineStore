package com.example.onlinestore.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.Arrays;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandling {
    @ExceptionHandler
    public ResponseEntity<ExceptionResponse> handleCategoryNotFoundException(CategoryNotFoundException exception){
        log.error("exception was thrown:",exception);
        ExceptionResponse exceptionResponse = new ExceptionResponse();

        exceptionResponse.setMessage(exception.getMessage());
        exceptionResponse.setStacktrace(Arrays.toString(exception.getStackTrace()));
        exceptionResponse.setStatus(HttpStatus.NOT_FOUND.value());
        exceptionResponse.setTimestamp(LocalDateTime.now());

        return new ResponseEntity<ExceptionResponse>(exceptionResponse,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<ExceptionResponse> handleOrderNotFoundException(OrderNotFoundException exception){
        ExceptionResponse exceptionResponse = new ExceptionResponse();

        exceptionResponse.setTimestamp(LocalDateTime.now());
        exceptionResponse.setMessage(exception.getMessage());
        exceptionResponse.setStatus(HttpStatus.NOT_FOUND.value());
        exceptionResponse.setStacktrace(Arrays.toString(exception.getStackTrace()));

        return new ResponseEntity<ExceptionResponse>(exceptionResponse,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<ExceptionResponse> handleOrderDetailNotFoundException(OrderDetailNotFoundException exception){
        ExceptionResponse exceptionResponse = new ExceptionResponse();

        exceptionResponse.setStacktrace(Arrays.toString(exception.getStackTrace()));
        exceptionResponse.setMessage(exception.getMessage());
        exceptionResponse.setTimestamp(LocalDateTime.now());
        exceptionResponse.setStatus(HttpStatus.NOT_FOUND.value());

        return new ResponseEntity<ExceptionResponse>(exceptionResponse,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<ExceptionResponse> handleProductNotFoundException(ProductNotFoundException exception){
        ExceptionResponse exceptionResponse = new ExceptionResponse();

        exceptionResponse.setStatus(HttpStatus.NOT_FOUND.value());
        exceptionResponse.setMessage(exception.getMessage());
        exceptionResponse.setTimestamp(LocalDateTime.now());
        exceptionResponse.setStacktrace(Arrays.toString(exception.getStackTrace()));

        return new ResponseEntity<ExceptionResponse>(exceptionResponse,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<ExceptionResponse> handleUserNotFoundException(UserNotFoundException exception){
        ExceptionResponse exceptionResponse = new ExceptionResponse();

        exceptionResponse.setTimestamp(LocalDateTime.now());
        exceptionResponse.setMessage(exception.getMessage());
        exceptionResponse.setStacktrace(Arrays.toString(exception.getStackTrace()));
        exceptionResponse.setStatus(HttpStatus.NOT_FOUND.value());

        return new ResponseEntity<ExceptionResponse>(exceptionResponse,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<ExceptionResponse> handleNullException(NullException nullException){
        ExceptionResponse exceptionResponse = new ExceptionResponse();

        exceptionResponse.setMessage(nullException.getMessage());
        exceptionResponse.setTimestamp(LocalDateTime.now());
        exceptionResponse.setStatus(HttpStatus.NO_CONTENT.value());
        exceptionResponse.setStacktrace(Arrays.toString(nullException.getStackTrace()));

        return new ResponseEntity<ExceptionResponse>(exceptionResponse,HttpStatus.NO_CONTENT);
    }
}

























