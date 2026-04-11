package GiorgiaFormicola.U5_W1_D4.repositories;

import GiorgiaFormicola.U5_W1_D4.entities.Building;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface BuildingsRepository extends JpaRepository<Building, UUID> {

    boolean existsByNameAndAddressAndCity(String name, String address, String city);

    Optional<Building> findByNameAndAddressAndCity(String name, String address, String city);

}
