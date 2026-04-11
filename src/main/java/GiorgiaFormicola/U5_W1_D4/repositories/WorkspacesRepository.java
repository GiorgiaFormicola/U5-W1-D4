package GiorgiaFormicola.U5_W1_D4.repositories;

import GiorgiaFormicola.U5_W1_D4.entities.Workspace;
import GiorgiaFormicola.U5_W1_D4.enums.WorkspaceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface WorkspacesRepository extends JpaRepository<Workspace, UUID> {
    List<Workspace> findByTypeAndBuilding_City(WorkspaceType type, String city);

    List<Workspace> findByBuilding_City(String city);

    List<Workspace> findByMaximumOccupantsGreaterThanEqualAndBuilding_City(int occupants, String city);

    List<Workspace> findByTypeAndMaximumOccupantsGreaterThanEqualAndBuilding_City(WorkspaceType type, int occupants, String city);
}
