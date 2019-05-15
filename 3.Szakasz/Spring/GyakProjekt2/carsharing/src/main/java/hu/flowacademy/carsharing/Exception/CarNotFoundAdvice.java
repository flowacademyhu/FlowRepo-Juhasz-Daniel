package hu.flowacademy.carsharing.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class CarNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(CarNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String carNotFoundHandler(CarNotFoundException e) {
        return e.getMessage();
    }

    @ResponseBody
    @ExceptionHandler(CannotDeleteException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String carDoesHaveReservation(CannotDeleteException e) {
        return e.getMessage();
    }

}
