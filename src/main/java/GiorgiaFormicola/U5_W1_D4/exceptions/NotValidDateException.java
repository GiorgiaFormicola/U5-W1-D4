package GiorgiaFormicola.U5_W1_D4.exceptions;

import java.time.LocalDate;

public class NotValidDateException extends RuntimeException {
    public NotValidDateException(LocalDate date) {
        super("The provided date (" + date + ") is not valid. The reservation date can't be earlier than today (" + LocalDate.now() + ").");
    }
}
