package GiorgiaFormicola.U5_W1_D4.entities;

import GiorgiaFormicola.U5_W1_D4.enums.WorkspaceType;
import GiorgiaFormicola.U5_W1_D4.exceptions.NotValidInputException;
import GiorgiaFormicola.U5_W1_D4.exceptions.NotValidOccupantsException;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "workspaces")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Workspace {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private UUID id;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private WorkspaceType type;

    @Column(name = "maximum_occupants", nullable = false)
    private int maximumOccupants;

    @ManyToOne
    @JoinColumn(name = "building_id", nullable = false)
    private Building building;

    public Workspace(String description, WorkspaceType type, int maximumOccupants, Building building) {
        if (description.trim().isEmpty()) throw new NotValidInputException();
        if (maximumOccupants <= 0) throw new NotValidOccupantsException(maximumOccupants);
        this.description = description;
        this.type = type;
        this.maximumOccupants = maximumOccupants;
        this.building = building;
    }
}
