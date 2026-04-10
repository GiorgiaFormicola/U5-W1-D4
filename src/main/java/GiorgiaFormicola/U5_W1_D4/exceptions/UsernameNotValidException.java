package GiorgiaFormicola.U5_W1_D4.exceptions;

public class UsernameNotValidException extends RuntimeException {
    public UsernameNotValidException(String username) {
        super("The provideD username ('" + username + "') is not valid. Username can't be longer than 30 characters and can't contain any spaces.");
    }
}
