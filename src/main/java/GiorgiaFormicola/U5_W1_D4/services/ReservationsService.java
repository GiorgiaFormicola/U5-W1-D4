package GiorgiaFormicola.U5_W1_D4.services;

import GiorgiaFormicola.U5_W1_D4.entities.Reservation;
import GiorgiaFormicola.U5_W1_D4.entities.User;
import GiorgiaFormicola.U5_W1_D4.entities.Workspace;
import GiorgiaFormicola.U5_W1_D4.exceptions.NotFoundException;
import GiorgiaFormicola.U5_W1_D4.exceptions.NotValidReservationException;
import GiorgiaFormicola.U5_W1_D4.exceptions.NotValidUpdateException;
import GiorgiaFormicola.U5_W1_D4.repositories.ReservationsRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.UUID;


@Slf4j
@Service
@AllArgsConstructor
public class ReservationsService {
    private final ReservationsRepository reservationsRepository;
    private final WorkspacesService workspacesService;
    private final UsersService usersService;

    public void saveNewReservation(LocalDate date, String workspaceId, String userId) {
        if (reservationsRepository.existsByUser_IdAndDate(UUID.fromString(userId), date))
            throw new NotValidReservationException("We're sorry, you have already reserved another workspace for the provided date (" + date + ").");
        if (reservationsRepository.existsByWorkspace_IdAndDate(UUID.fromString(workspaceId), date))
            throw new NotValidReservationException("We're sorry, the desired workspace is already reserved for the provided date (" + date + ").");
        Workspace workspaceFound = workspacesService.findById(workspaceId);
        User userFound = usersService.findById(userId);
        Reservation newReservation = new Reservation(date, workspaceFound, userFound);
        this.reservationsRepository.save(newReservation);
        log.info("Reservation for workspace of type '" + (String.valueOf(workspaceFound.getType()).replace("_", " ").toLowerCase()) + "' in " + workspaceFound.getBuilding().getName() + " by user " + userFound.getUsername() + " on date " + date + " successfully registered.");
    }

    public Reservation findById(String reservationId) {
        return this.reservationsRepository.findById(UUID.fromString(reservationId)).orElseThrow(() -> new NotFoundException("Reservation", "id", reservationId));
    }

    public void findByIdAndUpdate(String reservationId, Reservation updatedReservation) {
        Reservation found = this.findById(reservationId);
        if (found.getDate().equals(updatedReservation.getDate()) && found.getWorkspace().getId().equals(updatedReservation.getWorkspace().getId()))
            throw new NotValidUpdateException("reservation");
        if (reservationsRepository.existsByUser_IdAndDate(updatedReservation.getUser().getId(), updatedReservation.getDate()) && !updatedReservation.getDate().equals(found.getDate()))
            throw new NotValidReservationException("We're sorry, you have already reserved another workspace for the provided date (" + updatedReservation.getDate() + ").");
        if (reservationsRepository.existsByWorkspace_IdAndDate(updatedReservation.getWorkspace().getId(), updatedReservation.getDate()) && !updatedReservation.getDate().equals(found.getDate()))
            throw new NotValidReservationException("We're sorry, the desired workspace is already reserved for the provided date (" + updatedReservation.getDate() + ").");
        if (reservationsRepository.existsByWorkspace_IdAndDate(updatedReservation.getWorkspace().getId(), updatedReservation.getDate()) && !updatedReservation.getWorkspace().getId().equals(found.getWorkspace().getId()))
            throw new NotValidReservationException("We're sorry, the desired workspace is already reserved for the provided date (" + updatedReservation.getDate() + ").");
        found.setDate(updatedReservation.getDate());
        found.setWorkspace(updatedReservation.getWorkspace());
        this.reservationsRepository.save(found);
        log.info("Reservation with id " + found.getId() + " successfully updated.");
    }

    public void findByIdAndDelete(String reservationId) {
        Reservation found = this.findById(reservationId);
        this.reservationsRepository.delete(found);
        log.info("Reservation with id " + found.getId() + " successfully deleted.");
    }
}
