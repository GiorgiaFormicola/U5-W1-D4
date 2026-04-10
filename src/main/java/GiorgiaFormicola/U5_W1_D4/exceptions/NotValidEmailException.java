package GiorgiaFormicola.U5_W1_D4.exceptions;

public class NotValidEmailException extends RuntimeException {
    public NotValidEmailException(String email) {
        super("The provided email ('" + email + "') is not valid. Email must conform to the format 'mail@domain.extension'.");
    }
}
