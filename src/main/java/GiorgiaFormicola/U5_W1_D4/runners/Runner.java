package GiorgiaFormicola.U5_W1_D4.runners;

import GiorgiaFormicola.U5_W1_D4.services.BuildingsService;
import GiorgiaFormicola.U5_W1_D4.services.ReservationsService;
import GiorgiaFormicola.U5_W1_D4.services.UsersService;
import GiorgiaFormicola.U5_W1_D4.services.WorkspacesService;
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
    private final WorkspacesService workspacesService;
    private final ReservationsService reservationsService;

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

        //TEST WORKSPACES SERVICE
        // --- Test saveNewWorkspace
        /*try {
            Building buildingToSave = new Building("Palazzo dei congressi", "Piazza John Kennedy, 1", "Roma");
            buildingsService.saveNewBuilding(buildingToSave);
        } catch (NotValidBuildingException e) {
            log.error(e.getMessage());
        }

        try {
            workspacesService.saveNewWorkspace("Amazing workspace", WorkspaceType.CONFERENCE_ROOM, 100, "cf867337-e9f5-492f-9424-7182c1570ec6");
        } catch (NotFoundException | NotValidInputException | NotValidOccupantsException e) {
            log.error(e.getMessage());
        }

        try {
            workspacesService.saveNewWorkspace(" ", WorkspaceType.CONFERENCE_ROOM, 100, "cf867337-e9f5-492f-9424-7182c1570ec6");
        } catch (NotFoundException | NotValidInputException | NotValidOccupantsException e) {
            log.error(e.getMessage());
        }

        try {
            workspacesService.saveNewWorkspace("Amazing workspace", WorkspaceType.CONFERENCE_ROOM, -10, "cf867337-e9f5-492f-9424-7182c1570ec6");
        } catch (NotFoundException | NotValidInputException | NotValidOccupantsException e) {
            log.error(e.getMessage());
        }

        try {
            workspacesService.saveNewWorkspace("Amazing workspace", WorkspaceType.CONFERENCE_ROOM, 100, "cf867337-e9f5-492f-9424-7182c1570ec7");
        } catch (NotFoundException | NotValidInputException | NotValidOccupantsException e) {
            log.error(e.getMessage());
        }*/

        // --- Test findById
        /*try {
            Workspace workspaceInDB = workspacesService.findById("c3480dbb-c4fb-4ce4-8b60-f7f8acd252a1");
            System.out.println(workspaceInDB);
            Workspace workspaceNotInDB = workspacesService.findById("c3480dbb-c4fb-4ce4-8b60-f7f8acd252a3");
        } catch (NotFoundException e) {
            log.error(e.getMessage());
        }*/

        // --- Test findByIdAndUpdate
        /*try {
            Building buildingFromDB = buildingsService.findById("cf867337-e9f5-492f-9424-7182c1570ec6");
            Workspace updatedWorkspace = new Workspace("Fabulous workspace", WorkspaceType.PRIVATE, 10, buildingFromDB);
            workspacesService.findByIdAndUpdate("c3480dbb-c4fb-4ce4-8b60-f7f8acd252a1", updatedWorkspace);
        } catch (NotFoundException e) {
            log.error(e.getMessage());
        }*/

        // --- Test findByIdAndDelete
        /*try {
            workspacesService.findByIdAndDelete("c3480dbb-c4fb-4ce4-8b60-f7f8acd252a1");
            Workspace workspaceNotInDB = workspacesService.findById("c3480dbb-c4fb-4ce4-8b60-f7f8acd252a1");
        } catch (NotFoundException e) {
            log.error(e.getMessage());
        }*/

        // --- Test filterByTypeAndCity
        /*try {
            Building buildingToSave1 = new Building("Torre Hadid", "Piazza Tre Torri, 1", "Milano");
            Building buildingToSave2 = new Building("Auditorium Parco della Musica", "Via Pietro de Coubertin, 30", "Roma");
            buildingsService.saveNewBuilding(buildingToSave1);
            buildingsService.saveNewBuilding(buildingToSave2);
        } catch (NotValidBuildingException e) {
            log.error(e.getMessage());
        }*/

        /*
        workspacesService.saveNewWorkspace("Workspace1", WorkspaceType.PRIVATE, 30, "76d66d70-8d89-42da-a8f7-cc6f1178484c"); //ROMA
        workspacesService.saveNewWorkspace("Workspace2", WorkspaceType.PRIVATE, 30, "cf867337-e9f5-492f-9424-7182c1570ec6"); //ROMA
        workspacesService.saveNewWorkspace("Workspace3", WorkspaceType.CONFERENCE_ROOM, 30, "cf867337-e9f5-492f-9424-7182c1570ec6"); //ROMA
        workspacesService.saveNewWorkspace("Workspace4", WorkspaceType.PRIVATE, 10, "91da4c27-dc0b-4d2d-90fc-fd4ffc1f4bef"); //MILANO
        workspacesService.saveNewWorkspace("Workspace5", WorkspaceType.OPEN_SPACE, 60, "91da4c27-dc0b-4d2d-90fc-fd4ffc1f4bef"); //MILANO
        */

        /*try {
            List<Workspace> workspacesFound = workspacesService.filterByTypeAndCity(WorkspaceType.PRIVATE, "Roma");
            workspacesFound.forEach(System.out::println);
        } catch (NoWorkspaceFoundException e) {
            log.error(e.getMessage());
        }

        try {
            List<Workspace> workspacesFound = workspacesService.filterByTypeAndCity(WorkspaceType.PRIVATE, "Milano");
            workspacesFound.forEach(System.out::println);
        } catch (NoWorkspaceFoundException e) {
            log.error(e.getMessage());
        }

        try {
            List<Workspace> workspacesFound = workspacesService.filterByTypeAndCity(WorkspaceType.CONFERENCE_ROOM, "Milano");
            workspacesFound.forEach(System.out::println);
        } catch (NoWorkspaceFoundException e) {
            log.error(e.getMessage());
        }

        try {
            List<Workspace> workspacesFound = workspacesService.filterByTypeAndCity(WorkspaceType.CONFERENCE_ROOM, "Firenze");
            workspacesFound.forEach(System.out::println);
        } catch (NoWorkspaceFoundException e) {
            log.error(e.getMessage());
        }*/

        // --- Test filterByCity
        /*try {
            List<Workspace> workspacesFound = workspacesService.filterByCity("Roma");
            workspacesFound.forEach(System.out::println);
        } catch (NoWorkspaceFoundException e) {
            log.error(e.getMessage());
        }

        try {
            List<Workspace> workspacesFound = workspacesService.filterByCity("Firenze");
            workspacesFound.forEach(System.out::println);
        } catch (NoWorkspaceFoundException e) {
            log.error(e.getMessage());
        }*/

        // --- Test filterByMaximumOccupantsAndCity
        /*try {
            List<Workspace> workspacesFound = workspacesService.filterByMaximumOccupantsAndCity(5, "Milano");
            workspacesFound.forEach(System.out::println);
        } catch (NoWorkspaceFoundException e) {
            log.error(e.getMessage());
        }

        try {
            List<Workspace> workspacesFound = workspacesService.filterByMaximumOccupantsAndCity(60, "Milano");
            workspacesFound.forEach(System.out::println);
        } catch (NoWorkspaceFoundException e) {
            log.error(e.getMessage());
        }

        try {
            List<Workspace> workspacesFound = workspacesService.filterByMaximumOccupantsAndCity(100, "Milano");
            workspacesFound.forEach(System.out::println);
        } catch (NoWorkspaceFoundException e) {
            log.error(e.getMessage());
        }*/

        // --- Test filterByTypeAndMaximumOccupantsAndCity
        /*try {
            List<Workspace> workspacesFound = workspacesService.filterByTypeAndMaximumOccupantsAndCity(WorkspaceType.OPEN_SPACE, 60, "Milano");
            workspacesFound.forEach(System.out::println);
        } catch (NoWorkspaceFoundException e) {
            log.error(e.getMessage());
        }

        try {
            List<Workspace> workspacesFound = workspacesService.filterByTypeAndMaximumOccupantsAndCity(WorkspaceType.CONFERENCE_ROOM, 60, "Milano");
            workspacesFound.forEach(System.out::println);
        } catch (NoWorkspaceFoundException e) {
            log.error(e.getMessage());
        }*/

        //TEST RESERVATIONS SERVICE
        // --- Test saveNewReservation
        /*try {
            User userToSave1 = new User("marioRossi", "Mario", "Rossi", "mariorossi@gmail.com");
            User userToSave2 = new User("paoloVerdi", "Paolo", "Verdi", "paoloverdi@gmail.com");
            usersService.saveNewUser(userToSave1);
            usersService.saveNewUser(userToSave2);
        } catch (NotValidUserException e) {
            log.error(e.getMessage());
        }

        try {
            reservationsService.saveNewReservation(LocalDate.now(), "88490bb2-e036-4da0-8246-333c09880da3", "cb609645-0e9a-4c2f-abeb-796d32807a90");
        } catch (NotFoundException | NotValidReservationException e) {
            log.error(e.getMessage());
        }

        try {
            reservationsService.saveNewReservation(LocalDate.now(), "88490bb2-e036-4da0-8246-333c09880da3", "3c2f3bcc-984c-403e-a486-32ad046e4fcb");
        } catch (NotFoundException | NotValidReservationException e) {
            log.error(e.getMessage());
        }*/

        // -- Test findById
        /*try {
            Reservation reservationFromDB = reservationsService.findById("dcca5f46-8bbe-4249-a306-3641c0ba16f9");
            System.out.println(reservationFromDB);
            Reservation reservationNotFromDB = reservationsService.findById("dcca5f46-8bbe-4249-a306-3641c0ba16f6");
        } catch (NotFoundException e) {
            log.error(e.getMessage());
        }*/

        // -- Test findByIdAndUpdate
        /*Workspace workspace1FromDB = workspacesService.findById("88490bb2-e036-4da0-8246-333c09880da3");
        Workspace workspace2FromDB = workspacesService.findById("b607b34e-7005-4724-830e-f20d8d68ad76");
        User user1FromDB = usersService.findById("cb609645-0e9a-4c2f-abeb-796d32807a90");
        User user2FromDB = usersService.findById("3c2f3bcc-984c-403e-a486-32ad046e4fcb");

        try {
            reservationsService.saveNewReservation(LocalDate.now().plusDays(1), "88490bb2-e036-4da0-8246-333c09880da3", "cb609645-0e9a-4c2f-abeb-796d32807a90");
            reservationsService.saveNewReservation(LocalDate.now().plusDays(2), "b607b34e-7005-4724-830e-f20d8d68ad76", "cb609645-0e9a-4c2f-abeb-796d32807a90");
            reservationsService.saveNewReservation(LocalDate.now(), "b607b34e-7005-4724-830e-f20d8d68ad76", "3c2f3bcc-984c-403e-a486-32ad046e4fcb");
        } catch (NotValidReservationException e) {
            log.error((e.getMessage()));
        }

        try {
            Reservation updatedReservation = new Reservation(LocalDate.now(), workspace1FromDB, user1FromDB);
            reservationsService.findByIdAndUpdate("dcca5f46-8bbe-4249-a306-3641c0ba16f9", updatedReservation);
        } catch (NotFoundException | NotValidReservationException | NotValidUpdateException e) {
            log.error((e.getMessage()));
        }

        try { //USER WITH ANOTHER RESERVATION ON THE DAY AFTER TOMORROW TRYING TO CHANGE THE DATE OF RESERVATION
            Reservation updatedReservation = new Reservation(LocalDate.now().plusDays(2), workspace1FromDB, user1FromDB);
            reservationsService.findByIdAndUpdate("dcca5f46-8bbe-4249-a306-3641c0ba16f9", updatedReservation);
        } catch (NotFoundException | NotValidReservationException | NotValidUpdateException e) {
            log.error((e.getMessage()));
        }


        try { //USER TRYING TO CHANGE RESERVATION WORKSPACE BUT NEW WORKSPACE IS ALREADY BOOKED
            Reservation updatedReservation = new Reservation(LocalDate.now(), workspace2FromDB, user1FromDB);
            reservationsService.findByIdAndUpdate("dcca5f46-8bbe-4249-a306-3641c0ba16f9", updatedReservation);
        } catch (NotFoundException | NotValidReservationException | NotValidUpdateException e) {
            log.error((e.getMessage()));
        }*/

        // -- Test findByIdAndDelete
        /*try {
            reservationsService.findByIdAndDelete("25129e6b-22d1-4c40-bd7c-d6539b528078");
            Reservation reservationNotInDB = reservationsService.findById("25129e6b-22d1-4c40-bd7c-d6539b528078");
        } catch (NotFoundException e) {
            log.error(e.getMessage());
        }*/


    }
}
