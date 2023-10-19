package milansomyk.springboothw.controllers;


import milansomyk.springboothw.dto.ErrorDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

@RestControllerAdvice
public class ErrorController {
    public ResponseEntity<ErrorDto> handleError(MethodArgumentNotValidException e, WebRequest webRequest){
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(ErrorDto.builder()
                        .messages(List.of(e.getMessage()))
                        .build());
    }
}
