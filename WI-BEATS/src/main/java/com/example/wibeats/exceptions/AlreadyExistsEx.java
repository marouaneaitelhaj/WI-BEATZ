package com.example.wibeats.exceptions;

public class AlreadyExistsEx  extends  RuntimeException {
    public AlreadyExistsEx(String message) {
        super(message);
    }
}