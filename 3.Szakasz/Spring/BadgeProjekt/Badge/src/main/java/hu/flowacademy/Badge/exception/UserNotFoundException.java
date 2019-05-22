package hu.flowacademy.Badge.exception;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(String id) {
        super("Could not find user: " + id);
    }

}
