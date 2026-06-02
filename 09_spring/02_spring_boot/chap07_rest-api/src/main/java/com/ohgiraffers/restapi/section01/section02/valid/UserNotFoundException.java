package com.ohgiraffers.restapi.section01.section02.valid;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String message) {
        super(message);
    }
}
