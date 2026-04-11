package GiorgiaFormicola.U5_W1_D4.runners;

import GiorgiaFormicola.U5_W1_D4.services.BuildingsService;
import GiorgiaFormicola.U5_W1_D4.services.UsersService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@AllArgsConstructor
public class Runner implements CommandLineRunner {
    private final UsersService usersService;
    private final BuildingsService buildingsService;

    @Override
    public void run(String... args) throws Exception {
        //TEST USERS CREATION
        /*try {
            User validUser = new User("validUsername", "name", "surname", "valid@email.it");
            System.out.println(validUser);
        } catch (NotValidEmailException | NotValidUsernameException | NotValidInputException e) {
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
        } catch (NotValidUsernameException e) {
            log.error(e.getMessage());
        }

        try {
            User notValidEmailUser = new User("validUsername", "name", "surname", "not valid@email.it");
        } catch (NotValidEmailException e) {
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
        /*Building validBuilding = new Building("Dancing House", "Jiráskovo nám. 1981/6, 120 00 Nové Město", "Prague");

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
        }*/

        //TEST RESERVATIONS CREATION
        /*Building validBuilding = new Building("Dancing House", "Jiráskovo nám. 1981/6, 120 00 Nové Město", "Prague");
        Workspace validWorkspace = new Workspace("Amazing workspace", WorkspaceType.CONFERENCE_ROOM, 100, validBuilding);
        User validUser = new User("validUsername", "name", "surname", "valid@email.it");

        try {
            Reservation validReservation = new Reservation(LocalDate.now().plusDays(5), validWorkspace, validUser);
            System.out.println(validReservation);
        } catch (NotValidDateException e) {
            log.error(e.getMessage());
        }

        try {
            Reservation notValidReservation = new Reservation(LocalDate.now().minusDays(5), validWorkspace, validUser);
            System.out.println(notValidReservation);
        } catch (NotValidDateException e) {
            log.error(e.getMessage());
        }*/

        //TEST USERS SERVICE
        // --- Test saveNewUser
        /*try {
            User userToSave = new User("marioRossi", "Mario", "Rossi", "mariorossi@gmail.com");
            usersService.saveNewUser(userToSave);
        } catch (NotValidUserException e) {
            log.error(e.getMessage());
        }*/

        // --- Test findById
        /*try {
            User userInDB = usersService.findById("f9d2601b-9e9d-4d21-830c-ce4f6eeff596");
            System.out.println(userInDB);
        } catch (NotFoundException e) {
            log.error(e.getMessage());
        }*/

        /*try {
            User userNotInDB = usersService.findById("3da95dcb-4271-4e8d-90d2-3d77691b1af7");
            System.out.println(userNotInDB);
        } catch (NotFoundException e) {
            log.error(e.getMessage());
        }*/

        // --- Test findByEmail
        /*try {
            User userInDB = usersService.findByEmail("mariorossi@gmail.com");
            System.out.println(userInDB);
            User userNotInDB = usersService.findByEmail("mario@gmail.com");
            System.out.println(userNotInDB);
        } catch (NotFoundException e) {
            log.error(e.getMessage());
        }*/

        // --- Test findByUsername
        /*try {
            User userInDB = usersService.findByUsername("marioRossi");
            System.out.println(userInDB);
            User userNotInDB = usersService.findByUsername("mario");
            System.out.println(userNotInDB);
        } catch (NotFoundException e) {
            log.error(e.getMessage());
        }*/

        // --- Test findByIdAndUpdate
        /*try {
            User updatedUser = new User("mario", "Mario", "Rossi", "mariorossi@gmail.com");
            usersService.findByIdAndUpdate("f9d2601b-9e9d-4d21-830c-ce4f6eeff596", updatedUser);
            User updatedUserFromDB = usersService.findByUsername("mario");
            System.out.println(updatedUserFromDB);
        } catch (NotFoundException | NotValidUserException e) {
            log.error(e.getMessage());
        }*/

        /*try {
            User user2ToSave = new User("marioBianchi", "Mario", "Bianchi", "mariobianchi@gmail.com");
            usersService.saveNewUser(user2ToSave);
            User updatedUser = new User("marioBianchi", "Mario", "Rossi", "mariorossi@gmail.com");
            usersService.findByIdAndUpdate("f9d2601b-9e9d-4d21-830c-ce4f6eeff596", updatedUser);
        } catch (NotFoundException | NotValidUserException e) {
            log.error(e.getMessage());
        }*/

        // --- Test findByIdAndDelete
        /*try {
            usersService.findByIdAndDelete("9ff9c818-ee08-463b-8cca-d1de1358396f");
            User userFromDB = usersService.findByUsername("marioBianchi");
            System.out.println(userFromDB);
        } catch (NotFoundException e) {
            log.error(e.getMessage());
        }*/

        // --- Test findByUsernameAndUpdate
        /*try {
            User updatedUser = new User("mario", "Mario", "Rossi", "mario@gmail.com");
            usersService.findByUsernameAndUpdate("mario", updatedUser);
        } catch (NotFoundException | NotValidUserException e) {
            log.error(e.getMessage());
        }*/

        // --- Test findByEmailAndUpdate
        /*try {
            User updatedUser = new User("marioRossi", "Mario", "Rossi", "mariorossi@gmail.com");
            usersService.findByEmailAndUpdate("mario@gmail.com", updatedUser);
        } catch (NotFoundException | NotValidUserException e) {
            log.error(e.getMessage());
        }*/

        // --- Test findBySurnameAndDelete
        /*try {
            usersService.findByUsernameAndDelete("marioRossi");
            User userFromDB = usersService.findByUsername("marioRossi");
            System.out.println(userFromDB);
        } catch (NotFoundException e) {
            log.error(e.getMessage());
        }*/

        // --- Test findByEmailAndDelete
        /*try {
            User userToSave = new User("marioRossi", "Mario", "Rossi", "mariorossi@gmail.com");
            usersService.saveNewUser(userToSave);
        } catch (NotValidUserException e) {
            log.error(e.getMessage());
        }

        try {
            usersService.findByEmailAndDelete("mariorossi@gmail.com");
            User userFromDB = usersService.findByEmail("mariorossi@gmail.com");
            System.out.println(userFromDB);
        } catch (NotFoundException e) {
            log.error(e.getMessage());
        }*/

        //TEST BUILDINGS SERVICE
        // --- Test saveNewBuilding
        /*try {
            Building buildingToSave = new Building("Palazzo dei congressi", "Piazza John Kennedy, 1", "Roma");
            buildingsService.saveNewBuilding(buildingToSave);
        } catch (NotValidBuildingException e) {
            log.error(e.getMessage());
        }*/

        // --- Test findById
        /*try {
            Building buildingFromDB = buildingsService.findById("5f1761f3-a048-4f21-abfd-f27b86f7726a");
            System.out.println(buildingFromDB);
            Building buildingNotFromDB = buildingsService.findById("5f1761f3-a048-4f21-abfd-f27b86f7726b");
        } catch (NotFoundException e) {
            log.error(e.getMessage());
        }*/

        // --- Test findByNameAddressCity
        /*try {
            Building buildingFromDB = buildingsService.findByNameAddressCity("Palazzo dei congressi", "Piazza John Kennedy, 1", "Roma");
            System.out.println(buildingFromDB);
            Building buildingNotFromDB = buildingsService.findByNameAddressCity("Palazzo dei congressi", "Piazza John Kennedy, 1", "Milano");
        } catch (NotFoundException e) {
            log.error(e.getMessage());
        }*/

        // --- Test findByIdAndUpdate
        /*try {
            Building updatedBuilding = new Building("Palazzo dei congressi", "Piazza John Kennedy, 1", "Milano");
            buildingsService.findByIdAndUpdate("5f1761f3-a048-4f21-abfd-f27b86f7726a", updatedBuilding);
            Building buildingFromDB = buildingsService.findByNameAddressCity("Palazzo dei congressi", "Piazza John Kennedy, 1", "Milano");
            System.out.println(buildingFromDB);
            Building buildingNotFromDB = buildingsService.findByNameAddressCity("Palazzo dei congressi", "Piazza John Kennedy, 1", "Roma");
        } catch (NotFoundException e) {
            log.error(e.getMessage());
        }*/

        // --- Test findByNameAddressCityAndUpdate
        /*try {
            Building updatedBuilding = new Building("Palazzo dei congressi", "Piazza John Kennedy, 1", "Roma");
            buildingsService.findByNameAddressCityAndUpdate("Palazzo dei congressi", "Piazza John Kennedy, 1", "Milano", updatedBuilding);
            Building buildingFromDB = buildingsService.findByNameAddressCity("Palazzo dei congressi", "Piazza John Kennedy, 1", "Roma");
            System.out.println(buildingFromDB);
            Building buildingNotFromDB = buildingsService.findByNameAddressCity("Palazzo dei congressi", "Piazza John Kennedy, 1", "Milano");
        } catch (NotFoundException e) {
            log.error(e.getMessage());
        }*/

        // --- Test findByIdAndDelete
        /*try {
            buildingsService.findByIdAndDelete("5f1761f3-a048-4f21-abfd-f27b86f7726a");
            Building buildingNotFromDB = buildingsService.findByNameAddressCity("Palazzo dei congressi", "Piazza John Kennedy, 1", "Roma");
        } catch (NotFoundException e) {
            log.error(e.getMessage());
        }*/

        // --- Test findByNameAddressCityAndDelete
        /*try {
            Building buildingToSave = new Building("Palazzo dei congressi", "Piazza John Kennedy, 1", "Roma");
            buildingsService.saveNewBuilding(buildingToSave);
        } catch (NotValidBuildingException e) {
            log.error(e.getMessage());
        }

        try {
            buildingsService.findByNameAddressCityAndDelete("Palazzo dei congressi", "Piazza John Kennedy, 1", "Roma");
            Building buildingNotFromDB = buildingsService.findByNameAddressCity("Palazzo dei congressi", "Piazza John Kennedy, 1", "Roma");
        } catch (NotFoundException e) {
            log.error(e.getMessage());
        }*/
    }
}
