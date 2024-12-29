package com.test.exception;

public class OrderNotFoundException extends Exception {

    public OrderNotFoundException(String message)
    {
        super(message);
        System.out.println("OrderNotFoundException:- "+message);
    }
}
