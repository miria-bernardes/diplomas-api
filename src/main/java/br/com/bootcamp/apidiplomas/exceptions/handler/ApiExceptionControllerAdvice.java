package br.com.bootcamp.apidiplomas.exceptions.handler;

import br.com.bootcamp.apidiplomas.dto.ExceptionMessageDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.support.WebExchangeBindException;

import java.util.Objects;

@ControllerAdvice
public class ApiExceptionControllerAdvice {

    @ExceptionHandler({WebExchangeBindException.class, HttpMessageNotReadableException.class})
    public ResponseEntity<ExceptionMessageDTO> invalidArgumentHandler(WebExchangeBindException e) {
        return ResponseEntity.badRequest().body(new ExceptionMessageDTO(HttpStatus.BAD_REQUEST.value(),
                Objects.requireNonNull(e.getFieldError().getField()), e.getFieldError().getDefaultMessage()));
    }
}
