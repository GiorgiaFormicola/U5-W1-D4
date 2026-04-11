package GiorgiaFormicola.U5_W1_D4.repositories;

import GiorgiaFormicola.U5_W1_D4.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.UUID;

@Repository
public interface ReservationsRepository extends JpaRepository<Reservation, UUID> {
    boolean existsByUser_IdAndDate(UUID userId, LocalDate date);

    boolean existsByWorkspace_IdAndDate(UUID workspaceId, LocalDate date);
}
