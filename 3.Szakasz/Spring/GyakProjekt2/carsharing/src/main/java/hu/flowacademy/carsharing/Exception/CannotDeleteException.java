package hu.flowacademy.carsharing.Exception;

public class CannotDeleteException extends RuntimeException {

    public CannotDeleteException(String id){ super("Can not delete: " + id);}

}
