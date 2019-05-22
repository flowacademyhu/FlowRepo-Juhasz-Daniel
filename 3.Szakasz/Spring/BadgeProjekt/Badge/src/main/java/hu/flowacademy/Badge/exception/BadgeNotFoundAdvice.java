package hu.flowacademy.Badge.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class BadgeNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(BadgeNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String BadgeNotFoundHandler(BadgeNotFoundException e) {
        return e.getMessage();
    }

}
