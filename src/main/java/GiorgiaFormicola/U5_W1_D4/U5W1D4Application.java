package GiorgiaFormicola.U5_W1_D4;

import GiorgiaFormicola.U5_W1_D4.entities.Building;
import GiorgiaFormicola.U5_W1_D4.entities.Workspace;
import GiorgiaFormicola.U5_W1_D4.enums.WorkspaceType;
import GiorgiaFormicola.U5_W1_D4.exceptions.NotValidInputException;
import GiorgiaFormicola.U5_W1_D4.exceptions.NotValidOccupantsException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class U5W1D4Application {

    public static void main(String[] args) {
        SpringApplication.run(U5W1D4Application.class, args);
        //TEST USERS CREATION
        /*try {
            User validUser = new User("validUsername", "name", "surname", "valid@email.it");
            System.out.println(validUser);
        } catch (EmailNotValidException | UsernameNotValidException | NotValidInputException e) {
            log.error(e.getMessage());
        }

        try {
            User notValidInputUser = new User("notValidUsername", "   ", "surname", "valid@email.it");
        } catch (NotValidInputException e) {
            log.error(e.getMessage());
        }

        try {
            User notValidUsernameUser = new User("not validUsername", "name", "surname", "valid@email.it");
            ;
        } catch (UsernameNotValidException e) {
            log.error(e.getMessage());
        }

        try {
            User notValidEmailUser = new User("validUsername", "name", "surname", "not valid@email.it");
        } catch (EmailNotValidException e) {
            log.error(e.getMessage());
        }*/

        //TEST BUILDINGS CREATION
        /*try {
            Building validBuilding = new Building("Dancing House", "Jiráskovo nám. 1981/6, 120 00 Nové Město", "Prague");
            System.out.println(validBuilding);
        } catch (NotValidInputException e) {
            log.error(e.getMessage());
        }

        try {
            Building notValidBuilding = new Building("Dancing House", "", "Prague");
        } catch (NotValidInputException e) {
            log.error(e.getMessage());
        }*/

        //TEST WORKSPACES CREATION
        Building validBuilding = new Building("Dancing House", "Jiráskovo nám. 1981/6, 120 00 Nové Město", "Prague");

        try {
            Workspace validWorkspace = new Workspace("Amazing workspace", WorkspaceType.CONFERENCE_ROOM, 100, validBuilding);
            System.out.println(validWorkspace);
        } catch (NotValidInputException | NotValidOccupantsException e) {
            log.error(e.getMessage());
        }

        try {
            Workspace notValidDescriptionWorkspace = new Workspace("   ", WorkspaceType.CONFERENCE_ROOM, 100, validBuilding);
        } catch (NotValidInputException e) {
            log.error(e.getMessage());
        }

        try {
            Workspace notValidOccupantsWorkspace = new Workspace("Amazing workspace", WorkspaceType.CONFERENCE_ROOM, -5, validBuilding);
        } catch (NotValidOccupantsException e) {
            log.error(e.getMessage());
        }


    }

}
