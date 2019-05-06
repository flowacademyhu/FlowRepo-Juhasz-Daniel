package hu.flowacademy.shoppinglist.Exceptions;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String id) {
        super ("Could not find shopping list item" + id);
    }

}
