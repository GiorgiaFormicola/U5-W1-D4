package GiorgiaFormicola.U5_W1_D4.services;

import GiorgiaFormicola.U5_W1_D4.entities.Building;
import GiorgiaFormicola.U5_W1_D4.entities.Workspace;
import GiorgiaFormicola.U5_W1_D4.enums.WorkspaceType;
import GiorgiaFormicola.U5_W1_D4.exceptions.NoWorkspaceFoundException;
import GiorgiaFormicola.U5_W1_D4.exceptions.NotFoundException;
import GiorgiaFormicola.U5_W1_D4.exceptions.NotValidUpdateException;
import GiorgiaFormicola.U5_W1_D4.repositories.WorkspacesRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Slf4j
@Service
@AllArgsConstructor
public class WorkspacesService {
    private final WorkspacesRepository workspacesRepository;
    private final BuildingsService buildingsService;

    public void saveNewWorkspace(String description, WorkspaceType type, int maximumOccupants, String buildingId) {
        Building building = buildingsService.findById(buildingId);
        Workspace newWorkspace = new Workspace(description, type, maximumOccupants, building);
        this.workspacesRepository.save(newWorkspace);
        log.info("New workspace in building " + building.getName() + " (" + building.getAddress() + ", " + building.getCity() + ") successfully saved.");
    }

    public Workspace findById(String workspaceId) {
        return this.workspacesRepository.findById(UUID.fromString(workspaceId)).orElseThrow(() -> new NotFoundException("Workspace", "id", workspaceId));
    }

    public void findByIdAndUpdate(String workspaceId, Workspace updatedWorkspace) {
        Workspace found = this.findById(workspaceId);
        if (found.getDescription().equals(updatedWorkspace.getDescription()) && found.getType().equals(updatedWorkspace.getType()) && found.getMaximumOccupants() == updatedWorkspace.getMaximumOccupants())
            throw new NotValidUpdateException("workspace");
        found.setDescription(updatedWorkspace.getDescription());
        found.setType(updatedWorkspace.getType());
        found.setMaximumOccupants(updatedWorkspace.getMaximumOccupants());
        this.workspacesRepository.save(found);
        log.info("Workspace with id " + found.getId() + " successfully updated.");
    }

    public void findByIdAndDelete(String workspaceId) {
        Workspace found = this.findById(workspaceId);
        this.workspacesRepository.delete(found);
        log.info("Workspace with id " + found.getId() + " successfully deleted.");
    }

    public List<Workspace> filterByTypeAndCity(WorkspaceType type, String city) {
        List<Workspace> result = this.workspacesRepository.findByTypeAndBuilding_CityOrderByMaximumOccupantsAsc(type, city);
        if (result.isEmpty())
            throw new NoWorkspaceFoundException(("of type '" + String.valueOf(type).replace("_", " ").toLowerCase()) + "'", city);
        return result;
    }

    public List<Workspace> filterByCity(String city) {
        List<Workspace> result = this.workspacesRepository.findByBuilding_CityOrderByMaximumOccupantsAsc(city);
        if (result.isEmpty()) throw new NoWorkspaceFoundException("of any type", city);
        return result;
    }

    public List<Workspace> filterByMaximumOccupantsAndCity(int occupants, String city) {
        List<Workspace> result = this.workspacesRepository.findByMaximumOccupantsGreaterThanEqualAndBuilding_CityOrderByMaximumOccupantsAsc(occupants, city);
        if (result.isEmpty()) throw new NoWorkspaceFoundException("for " + occupants + " people", city);
        return result;
    }

    public List<Workspace> filterByTypeAndMaximumOccupantsAndCity(WorkspaceType type, int occupants, String city) {
        List<Workspace> result = this.workspacesRepository.findByTypeAndMaximumOccupantsGreaterThanEqualAndBuilding_CityOrderByMaximumOccupantsAsc(type, occupants, city);
        if (result.isEmpty())
            throw new NoWorkspaceFoundException(("of type '" + String.valueOf(type).replace("_", " ").toLowerCase()) + "' for " + occupants + " people", city);
        return result;
    }

    public List<Workspace> filterByTypeAndMaximumOccupantsAndCityAndDate(WorkspaceType type, int occupants, String city, LocalDate date) {
        List<Workspace> result = this.workspacesRepository.findByTypeAndMaximumOccupantsAndCityAndDateOrderByMaximumOccupants(type, occupants, city, date);
        if (result.isEmpty())
            throw new NoWorkspaceFoundException(("of type '" + String.valueOf(type).replace("_", " ").toLowerCase()) + "' for " + occupants + " people on " + date, city);
        return result;
    }
}
