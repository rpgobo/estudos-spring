package com.estudos.goboraf.estudosspring1.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@RestController
@ControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<EstudosException> handleAllExceptions(Exception ex, WebRequest webRequest){
        EstudosException estudosException = new EstudosException(
                new Date(),ex.getMessage(), webRequest.getDescription(false));

        return new ResponseEntity<>(estudosException, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(UnsupportedMathOperationException.class)
    public final ResponseEntity<EstudosException> handleBadRequestExceptions(Exception ex, WebRequest webRequest){
        EstudosException estudosException = new EstudosException(
                new Date(),ex.getMessage(), webRequest.getDescription(false));

        return new ResponseEntity<>(estudosException, HttpStatus.BAD_REQUEST);
    }
}
