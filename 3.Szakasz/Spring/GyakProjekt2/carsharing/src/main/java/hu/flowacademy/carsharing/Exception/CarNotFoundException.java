package hu.flowacademy.carsharing.Exception;

public class CarNotFoundException extends RuntimeException{

    public CarNotFoundException(String id){ super("Car not found: " + id);}
}
