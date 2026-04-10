package GiorgiaFormicola.U5_W1_D4.exceptions;

public class NotValidUsernameException extends RuntimeException {
    public NotValidUsernameException(String username) {
        super("The provided username ('" + username + "') is not valid. Username can't be longer than 30 characters and can't contain any spaces.");
    }
}
