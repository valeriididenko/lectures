package com.hillel.lectures.lecture7;

public class MyCustomException extends Exception {

    public MyCustomException(String message) {
        super("My custom exception appeared with the message: " + message);
    }

}
