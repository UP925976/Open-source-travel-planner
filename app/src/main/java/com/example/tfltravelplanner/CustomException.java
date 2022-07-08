package com.example.tfltravelplanner;

public class CustomException extends RuntimeException {

    public CustomException(String ExceptionInfo){
        super(ExceptionInfo);
    }
}