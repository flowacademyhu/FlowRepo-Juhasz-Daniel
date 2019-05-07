package hu.flowacademy.shoppinglist.Exceptions;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String username) {
        super ("Could not find shopping list item" + username);
    }

}
