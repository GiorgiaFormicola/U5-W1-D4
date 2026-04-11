package GiorgiaFormicola.U5_W1_D4.exceptions;

public class NoWorkspaceFoundException extends RuntimeException {
    public NoWorkspaceFoundException(String message, String city) {
        super("We're sorry, no workspaces " + message + " found in " + city + ".");
    }
}
