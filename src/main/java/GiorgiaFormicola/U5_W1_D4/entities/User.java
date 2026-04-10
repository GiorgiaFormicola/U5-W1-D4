package GiorgiaFormicola.U5_W1_D4.entities;

import GiorgiaFormicola.U5_W1_D4.exceptions.NotValidEmailException;
import GiorgiaFormicola.U5_W1_D4.exceptions.NotValidInputException;
import GiorgiaFormicola.U5_W1_D4.exceptions.NotValidUsernameException;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private UUID id;

    @Column(nullable = false, length = 30, unique = true)
    private String username;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String surname;

    @Column(nullable = false, unique = true)
    private String email;

    public User(String username, String name, String surname, String email) {
        if (username.trim().isEmpty() || name.trim().isEmpty() || surname.trim().isEmpty() || email.trim().isEmpty())
            throw new NotValidInputException();
        if (username.contains(" ") || username.length() > 30) throw new NotValidUsernameException(username);
        if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) throw new NotValidEmailException(email);
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.email = email;
    }
}
