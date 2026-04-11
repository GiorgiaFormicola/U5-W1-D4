package GiorgiaFormicola.U5_W1_D4.services;

import GiorgiaFormicola.U5_W1_D4.entities.Building;
import GiorgiaFormicola.U5_W1_D4.exceptions.NotFoundException;
import GiorgiaFormicola.U5_W1_D4.exceptions.NotValidBuildingException;
import GiorgiaFormicola.U5_W1_D4.exceptions.NotValidUpdateException;
import GiorgiaFormicola.U5_W1_D4.repositories.BuildingsRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@AllArgsConstructor
public class BuildingsService {
    private final BuildingsRepository buildingsRepository;

    public void saveNewBuilding(Building newBuilding) {
        if (this.buildingsRepository.existsByNameAndAddressAndCity(newBuilding.getName(), newBuilding.getAddress(), newBuilding.getCity()))
            throw new NotValidBuildingException(newBuilding);
        this.buildingsRepository.save(newBuilding);
        log.info("Building " + newBuilding.getName() + " successfully saved!");
    }

    public Building findById(String buildingId) {
        return this.buildingsRepository.findById(UUID.fromString(buildingId)).orElseThrow(() -> new NotFoundException("Building", "id", buildingId));
    }

    public Building findByNameAddressCity(String name, String address, String city) {
        if (this.buildingsRepository.findByNameAndAddressAndCity(name, address, city).isEmpty())
            throw new NotFoundException(("Building " + name), "address", (address + " (" + city + ")"));
        return this.buildingsRepository.findByNameAndAddressAndCity(name, address, city).get();
    }

    public void findByIdAndUpdate(String buildingId, Building updatedBuilding) {
        Building found = this.findById(buildingId);
        if (found.getName().equals(updatedBuilding.getName()) && found.getAddress().equals(updatedBuilding.getAddress()) && found.getCity().equals(updatedBuilding.getCity()))
            throw new NotValidUpdateException("building");
        if (this.buildingsRepository.existsByNameAndAddressAndCity(updatedBuilding.getName(), updatedBuilding.getAddress(), updatedBuilding.getCity())
                && !updatedBuilding.getName().equals(found.getName()) && !updatedBuilding.getAddress().equals(found.getAddress()) && !updatedBuilding.getCity().equals(found.getCity()))
            throw new NotValidBuildingException(updatedBuilding);
        found.setName(updatedBuilding.getName());
        found.setAddress(updatedBuilding.getAddress());
        found.setCity(updatedBuilding.getCity());
        this.buildingsRepository.save(found);
        log.info("Building with id " + found.getId() + " successfully updated.");
    }

    public void findByNameAddressCityAndUpdate(String name, String address, String city, Building updatedBuilding) {
        Building found = this.findByNameAddressCity(name, address, city);
        if (found.getName().equals(updatedBuilding.getName()) && found.getAddress().equals(updatedBuilding.getAddress()) && found.getCity().equals(updatedBuilding.getCity()))
            throw new NotValidUpdateException("building");
        if (this.buildingsRepository.existsByNameAndAddressAndCity(updatedBuilding.getName(), updatedBuilding.getAddress(), updatedBuilding.getCity())
                && !updatedBuilding.getName().equals(found.getName()) && !updatedBuilding.getAddress().equals(found.getAddress()) && !updatedBuilding.getCity().equals(found.getCity()))
            throw new NotValidBuildingException(updatedBuilding);
        found.setName(updatedBuilding.getName());
        found.setAddress(updatedBuilding.getAddress());
        found.setCity(updatedBuilding.getCity());
        this.buildingsRepository.save(found);
        log.info("Building successfully updated.");
    }

    public void findByIdAndDelete(String buildingId) {
        Building found = this.findById(buildingId);
        this.buildingsRepository.delete(found);
        log.info("Building with id " + found.getId() + " successfully deleted.");
    }

    public void findByNameAddressCityAndDelete(String name, String address, String city) {
        Building found = this.findByNameAddressCity(name, address, city);
        this.buildingsRepository.delete(found);
        log.info("Building successfully deleted.");
    }


}
