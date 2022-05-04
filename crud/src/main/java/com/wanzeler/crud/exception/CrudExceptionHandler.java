package com.wanzeler.crud.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CrudExceptionHandler extends ResponseEntityExceptionHandler {

    public final ResponseEntity<ExceptionResponse> handlerBadRequestException(Exception ex, WebRequest request) {
        ExceptionResponse exceptionResponse = new ExceptionResponse();
        return new ResponseEntity<ExceptionResponse>(exceptionResponse, HttpStatus.BAD_REQUEST);
    }
}
