package hu.flowacademy.carsharing.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class DriverNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(DriverNotFoundExpection.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String driverNotFoundHandler(DriverNotFoundExpection e) {
        return e.getMessage();
    }

}
