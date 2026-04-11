package GiorgiaFormicola.U5_W1_D4.exceptions;

public class NotValidUpdateException extends RuntimeException {
    public NotValidUpdateException(String dataType) {
        super("Impossible to update the " + dataType + ". No changes in " + dataType + " properties detected.");
    }
}
