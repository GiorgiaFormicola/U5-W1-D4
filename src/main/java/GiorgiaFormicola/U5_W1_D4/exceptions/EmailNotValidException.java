package GiorgiaFormicola.U5_W1_D4.exceptions;

public class EmailNotValidException extends RuntimeException {
    public EmailNotValidException(String email) {
        super("The provideD email ('" + email + "') is not valid. Email must conform to the format 'mail@domain.extension'.");
    }
}
