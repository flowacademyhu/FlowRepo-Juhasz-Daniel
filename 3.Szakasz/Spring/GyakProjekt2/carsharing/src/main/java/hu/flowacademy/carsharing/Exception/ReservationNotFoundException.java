package hu.flowacademy.carsharing.Exception;

public class ReservationNotFoundException extends RuntimeException {

    public ReservationNotFoundException(String id){ super("Reservation not found: " + id);}

}
