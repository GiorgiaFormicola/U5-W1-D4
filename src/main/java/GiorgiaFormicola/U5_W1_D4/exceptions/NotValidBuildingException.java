package GiorgiaFormicola.U5_W1_D4.exceptions;

import GiorgiaFormicola.U5_W1_D4.entities.Building;

public class NotValidBuildingException extends RuntimeException {
    public NotValidBuildingException(Building building) {
        super("Impossible to save the building " + building.getName() + " (" + building.getAddress() + ", " + building.getCity() + "). Building already registered.");
    }
}
