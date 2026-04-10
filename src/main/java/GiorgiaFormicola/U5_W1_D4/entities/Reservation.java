package GiorgiaFormicola.U5_W1_D4.entities;

import GiorgiaFormicola.U5_W1_D4.exceptions.NotValidDateException;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "reservations", uniqueConstraints = {@UniqueConstraint(columnNames = {"date", "user_id"})})
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Reservation {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private UUID id;

    @Column(nullable = false)
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "workspace_id", nullable = false)
    private Workspace workspace;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Reservation(LocalDate date, Workspace workspace, User user) {
        if (date.isBefore(LocalDate.now())) throw new NotValidDateException(date);
        this.date = date;
        this.workspace = workspace;
        this.user = user;
    }

}
