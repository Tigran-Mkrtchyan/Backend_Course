package am.picsart.lesson4.first_task.exceptions;

public class IncorrectEmailFormatException extends Exception {
    public IncorrectEmailFormatException(String message) {
        super(message);
    }
}
