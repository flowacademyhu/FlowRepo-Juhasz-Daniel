package hu.flowacademy.bider.Exception;

public class NotFoundedException extends RuntimeException {

    public NotFoundedException(Long id){
        super("Could not find id: "+ id);
    }

}
