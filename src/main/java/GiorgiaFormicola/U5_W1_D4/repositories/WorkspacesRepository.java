package GiorgiaFormicola.U5_W1_D4.repositories;

import GiorgiaFormicola.U5_W1_D4.entities.Workspace;
import GiorgiaFormicola.U5_W1_D4.enums.WorkspaceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Repository
public interface WorkspacesRepository extends JpaRepository<Workspace, UUID> {
    List<Workspace> findByTypeAndBuilding_CityOrderByMaximumOccupantsAsc(WorkspaceType type, String city);

    List<Workspace> findByBuilding_CityOrderByMaximumOccupantsAsc(String city);

    List<Workspace> findByMaximumOccupantsGreaterThanEqualAndBuilding_CityOrderByMaximumOccupantsAsc(int occupants, String city);

    List<Workspace> findByTypeAndMaximumOccupantsGreaterThanEqualAndBuilding_CityOrderByMaximumOccupantsAsc(WorkspaceType type, int occupants, String city);

    @Query("SELECT w FROM Workspace w WHERE w.type = :type AND w.maximumOccupants >= :occupants AND w.building.city = :city AND NOT EXISTS (SELECT 1 FROM Reservation r WHERE r.workspace = w AND r.date = :date) ORDER BY w.maximumOccupants ASC")
    List<Workspace> findByTypeAndMaximumOccupantsAndCityAndDateOrderByMaximumOccupants(WorkspaceType type, int occupants, String city, LocalDate date);
}
