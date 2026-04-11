package GiorgiaFormicola.U5_W1_D4.exceptions;

public class NotValidUserException extends RuntimeException {
    public NotValidUserException(String inputType, String input) {
        super("Impossible to save the user. " + inputType + " '" + input + "' already in use.");
    }
}
