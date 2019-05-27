package hu.flowacademy.bider.Exception;

public class BidException extends RuntimeException {

    public BidException(Long id) {
        super("Could not find bid " + id);
    }

}
