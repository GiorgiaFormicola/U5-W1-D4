package GiorgiaFormicola.U5_W1_D4.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String resourceType, String searchParameterType, String searchInput) {
        super(resourceType + " with " + searchParameterType + " " + searchInput + " not found.");
    }
}
