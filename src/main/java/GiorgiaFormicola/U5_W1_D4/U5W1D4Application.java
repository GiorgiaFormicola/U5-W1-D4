package GiorgiaFormicola.U5_W1_D4;

import GiorgiaFormicola.U5_W1_D4.entities.User;
import GiorgiaFormicola.U5_W1_D4.exceptions.EmailNotValidException;
import GiorgiaFormicola.U5_W1_D4.exceptions.NotValidInputException;
import GiorgiaFormicola.U5_W1_D4.exceptions.UsernameNotValidException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class U5W1D4Application {

    public static void main(String[] args) {
        SpringApplication.run(U5W1D4Application.class, args);
        //TEST USERS CREATION
        try {
            User validUser = new User("validUsername", "name", "surname", "valid@email.it");
            System.out.println(validUser);
        } catch (EmailNotValidException | UsernameNotValidException | NotValidInputException e) {
            log.error(e.getMessage());
        }

        try {
            User notValidInputUser = new User("notValidUsername", "   ", "surname", "valid@email.it");
        } catch (NotValidInputException e) {
            log.error(e.getMessage());
        }

        try {
            User notValidUsernameUser = new User("not validUsername", "name", "surname", "valid@email.it");
            ;
        } catch (UsernameNotValidException e) {
            log.error(e.getMessage());
        }

        try {
            User notValidEmailUser = new User("validUsername", "name", "surname", "not valid@email.it");
        } catch (EmailNotValidException e) {
            log.error(e.getMessage());
        }


    }

}
