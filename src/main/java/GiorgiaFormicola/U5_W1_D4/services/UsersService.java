package GiorgiaFormicola.U5_W1_D4.services;

import GiorgiaFormicola.U5_W1_D4.entities.User;
import GiorgiaFormicola.U5_W1_D4.exceptions.NotFoundException;
import GiorgiaFormicola.U5_W1_D4.exceptions.NotValidUserException;
import GiorgiaFormicola.U5_W1_D4.repositories.UsersRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@AllArgsConstructor
public class UsersService {
    private final UsersRepository usersRepository;

    public void saveNewUser(User newUser) {
        if (this.usersRepository.existsByEmail(newUser.getEmail()))
            throw new NotValidUserException("Email", newUser.getEmail());
        if (this.usersRepository.existsByUsername(newUser.getUsername()))
            throw new NotValidUserException("Username", newUser.getUsername());
        this.usersRepository.save(newUser);
        log.info("User " + newUser.getUsername() + " successfully saved!");
    }

    public User findById(String userId) {
        return this.usersRepository.findById(UUID.fromString(userId)).orElseThrow(() -> new NotFoundException("User", "id", userId));
    }

    public User findByEmail(String email) {
        if (this.usersRepository.findByEmail(email).isEmpty()) throw new NotFoundException("User", "email", email);
        return this.usersRepository.findByEmail(email).get();
    }

    public User findByUsername(String username) {
        if (this.usersRepository.findByUsername(username).isEmpty())
            throw new NotFoundException("User", "username", username);
        return this.usersRepository.findByUsername(username).get();
    }

    public void findByIdAndUpdate(String userId, User updatedUser) {
        User found = this.findById(userId);
        if (this.usersRepository.existsByEmail(updatedUser.getEmail()) && !updatedUser.getEmail().equals(found.getEmail()))
            throw new NotValidUserException("Email", updatedUser.getEmail());
        if (this.usersRepository.existsByUsername(updatedUser.getUsername()) && !updatedUser.getUsername().equals(found.getUsername()))
            throw new NotValidUserException("Username", updatedUser.getUsername());
        found.setUsername(updatedUser.getUsername());
        found.setName(updatedUser.getName());
        found.setSurname(updatedUser.getSurname());
        found.setEmail(updatedUser.getEmail());
        this.usersRepository.save(found);
        log.info("User with id " + found.getId() + " successfully updated.");
    }

    public void findByUsernameAndUpdate(String username, User updatedUser) {
        User found = this.findByUsername(username);
        if (this.usersRepository.existsByEmail(updatedUser.getEmail()) && !updatedUser.getEmail().equals(found.getEmail()))
            throw new NotValidUserException("Email", updatedUser.getEmail());
        if (this.usersRepository.existsByUsername(updatedUser.getUsername()) && !updatedUser.getUsername().equals(found.getUsername()))
            throw new NotValidUserException("Username", updatedUser.getUsername());
        found.setUsername(updatedUser.getUsername());
        found.setName(updatedUser.getName());
        found.setSurname(updatedUser.getSurname());
        found.setEmail(updatedUser.getEmail());
        this.usersRepository.save(found);
        log.info("User with id " + found.getId() + " successfully updated.");
    }

    public void findByEmailAndUpdate(String email, User updatedUser) {
        User found = this.findByEmail(email);
        if (this.usersRepository.existsByEmail(updatedUser.getEmail()) && !updatedUser.getEmail().equals(found.getEmail()))
            throw new NotValidUserException("Email", updatedUser.getEmail());
        if (this.usersRepository.existsByUsername(updatedUser.getUsername()) && !updatedUser.getUsername().equals(found.getUsername()))
            throw new NotValidUserException("Username", updatedUser.getUsername());
        found.setUsername(updatedUser.getUsername());
        found.setName(updatedUser.getName());
        found.setSurname(updatedUser.getSurname());
        found.setEmail(updatedUser.getEmail());
        this.usersRepository.save(found);
        log.info("User with id " + found.getId() + " successfully updated.");
    }

    public void findByIdAndDelete(String userId) {
        User found = this.findById(userId);
        this.usersRepository.delete(found);
        log.info("User with id " + found.getId() + " successfully deleted.");
    }

    public void findByUsernameAndDelete(String username) {
        User found = this.findByUsername(username);
        this.usersRepository.delete(found);
        log.info("User with id " + found.getId() + " successfully deleted.");
    }

    public void findByEmailAndDelete(String email) {
        User found = this.findByEmail(email);
        this.usersRepository.delete(found);
        log.info("User with id " + found.getId() + " successfully deleted.");
    }
}
