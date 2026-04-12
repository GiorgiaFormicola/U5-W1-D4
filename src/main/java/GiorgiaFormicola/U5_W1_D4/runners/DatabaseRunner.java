package GiorgiaFormicola.U5_W1_D4.runners;

import GiorgiaFormicola.U5_W1_D4.repositories.BuildingsRepository;
import GiorgiaFormicola.U5_W1_D4.repositories.ReservationsRepository;
import GiorgiaFormicola.U5_W1_D4.repositories.UsersRepository;
import GiorgiaFormicola.U5_W1_D4.repositories.WorkspacesRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@AllArgsConstructor
@Order(1)
public class DatabaseRunner implements CommandLineRunner {
    private final BuildingsRepository buildingsRepository;
    private final WorkspacesRepository workspacesRepository;
    private final ReservationsRepository reservationsRepository;
    private final UsersRepository usersRepository;

    @Override
    public void run(String... args) throws Exception {

        /*reservationsRepository.deleteAll();
        workspacesRepository.deleteAll();
        buildingsRepository.deleteAll();
        usersRepository.deleteAll();

        User user1 = new User("marioRossi", "Mario", "Rossi", "mariorossi@gmail.com");
        User user2 = new User("paoloVerdi", "Paolo", "Verdi", "paoloverdi@gmail.com");
        User user3 = new User("pietroBianchi", "Pietro", "Bianchi", "pietrobianchi@gmail.com");

        usersRepository.saveAll(List.of(user1, user2, user3));

        Building building1 = new Building("Palazzo dei congressi", "Piazza John Kennedy, 1", "Roma");
        Building building2 = new Building("Torre Hadid", "Piazza Tre Torri, 1", "Milano");
        Building building3 = new Building("Auditorium Parco della Musica", "Via Pietro de Coubertin, 30", "Roma");

        buildingsRepository.saveAll(List.of(building1, building2, building3));

        Workspace workspace1 = new Workspace("Open space in Rome", WorkspaceType.OPEN_SPACE, 10, building1);
        Workspace workspace2 = new Workspace("Conference Room in Rome", WorkspaceType.CONFERENCE_ROOM, 5, building1);
        Workspace workspace3 = new Workspace("Private Office in Milan", WorkspaceType.PRIVATE, 2, building2);
        Workspace workspace4 = new Workspace("Open Space in Milan", WorkspaceType.OPEN_SPACE, 20, building2);
        Workspace workspace5 = new Workspace("Conference Room in Rome", WorkspaceType.CONFERENCE_ROOM, 20, building3);
        Workspace workspace6 = new Workspace("Open space in Rome", WorkspaceType.OPEN_SPACE, 20, building3);

        workspacesRepository.saveAll(List.of(workspace1, workspace2, workspace3, workspace4, workspace5, workspace6));

        Reservation reservation1 = new Reservation(LocalDate.now(), workspace1, user1);
        Reservation reservation2 = new Reservation(LocalDate.now(), workspace2, user2);
        Reservation reservation3 = new Reservation(LocalDate.now().plusDays(1), workspace3, user1);

        reservationsRepository.saveAll(List.of(reservation1, reservation2, reservation3));

        log.info("Database successfully populated!");*/

    }
}
