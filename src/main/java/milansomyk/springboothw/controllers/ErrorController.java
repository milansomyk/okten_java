package milansomyk.springboothw.controllers;


import milansomyk.springboothw.dto.ErrorDto;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.io.IOException;
import java.util.Arrays;


@RestControllerAdvice
public class ErrorController {
    @ExceptionHandler({MethodArgumentNotValidException.class})
    public ResponseEntity<ErrorDto> handleError(MethodArgumentNotValidException e, WebRequest webRequest){
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(ErrorDto.builder()
                        .messages(e.getFieldErrors().stream().map(DefaultMessageSourceResolvable::getDefaultMessage).toList())
                        .build());
    }
    @ExceptionHandler({IOException.class})
    public ResponseEntity<ErrorDto> handleError(IOException e, WebRequest webRequest){
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(ErrorDto.builder()
                        .messages(Arrays.asList(e.getMessage()))
                        .build());
    }
}
