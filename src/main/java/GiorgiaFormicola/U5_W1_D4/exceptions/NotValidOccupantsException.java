package GiorgiaFormicola.U5_W1_D4.exceptions;

public class NotValidOccupantsException extends RuntimeException {
    public NotValidOccupantsException(int maximumOccupants) {
        super("The provided number of occupants (" + maximumOccupants + ") is not valid. The maximum number of occupants for a workspace must be bigger than zero.");
    }
}
