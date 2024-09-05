package org.example.exceptionhandling;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public abstract class ProductNotFoundException extends RuntimeException{


    private String message;
    public ProductNotFoundException(){};

    public ProductNotFoundException(String message){
        super(message);

    }
}
