package exceptions;

public class NumberLessThanZeroException extends RuntimeException {

    public NumberLessThanZeroException(String message) {
        super(message);
    }
}