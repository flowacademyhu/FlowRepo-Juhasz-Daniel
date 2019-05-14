package hu.flowacademy.carsharing.Exception;

public class DriverNotFoundExpection extends RuntimeException{

    public DriverNotFoundExpection(String id){ super("Driver not found: " + id);}

}
