package com.example.back.actuator.exception;

public class GameNotFoundException extends RuntimeException {
    public GameNotFoundException(String id){
        super("Could not find Game with id: " + id);
    }
}
