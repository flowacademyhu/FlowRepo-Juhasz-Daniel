package hu.flowacademy.shoppinglist.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ShoppingListItemNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(ShoppingListItemNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String itenmNotFoundHandler(ShoppingListItemNotFoundException e) {
        return e.getMessage();
    }

    @ResponseBody
    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String userNotFoundHandler(UserNotFoundException e) {
        return e.getMessage();
    }
}
