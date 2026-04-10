package GiorgiaFormicola.U5_W1_D4.entities;

import GiorgiaFormicola.U5_W1_D4.exceptions.NotValidInputException;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "buildings", uniqueConstraints = {@UniqueConstraint(columnNames = {"name", "address", "city"})})
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Building {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String city;

    public Building(String name, String address, String city) {
        if (name.trim().isEmpty() || address.trim().isEmpty() || city.trim().isEmpty())
            throw new NotValidInputException();
        this.name = name;
        this.address = address;
        this.city = city;
    }
}
