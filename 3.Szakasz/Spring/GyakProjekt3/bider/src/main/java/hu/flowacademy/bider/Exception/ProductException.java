package hu.flowacademy.bider.Exception;

public class ProductException extends RuntimeException{

    public ProductException(Long id) {
        super("Could not find product " + id);
    }

}
