package hu.flowacademy.bider.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class BidAdvice {

    @ResponseBody
    @ExceptionHandler(BidException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String BidNotFoundHandler(BidException e) {
        return e.getMessage();
    }

}
