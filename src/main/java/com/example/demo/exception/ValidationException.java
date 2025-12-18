package com.example.demo.exception;
public class ValidationException extends RuntimeException{
       
       public ValidationException(String message){
        super(message);  //to access parent method 
       }
    
}