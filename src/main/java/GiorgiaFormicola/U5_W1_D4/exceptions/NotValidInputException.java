package GiorgiaFormicola.U5_W1_D4.exceptions;

public class NotValidInputException extends RuntimeException {
    public NotValidInputException() {
        super("The provided input is not valid. Input can't be void.");
    }
}
