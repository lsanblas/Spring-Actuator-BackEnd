package com.example.back.actuator.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHandlerController {

    private static final Logger log = LoggerFactory.getLogger(ExceptionHandlerController.class);

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(GameNotFoundException.class)
    public ResponseEntity< String> handleSearchNotValidException(GameNotFoundException ex) {
        log.error("SearchNotValidException handle for bad request with message: {}", ex.getMessage());
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
}
