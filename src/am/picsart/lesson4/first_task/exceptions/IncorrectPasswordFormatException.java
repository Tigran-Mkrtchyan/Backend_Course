package am.picsart.lesson4.first_task.exceptions;

public class IncorrectPasswordFormatException extends Exception {
    public IncorrectPasswordFormatException(String message) {
        super(message);
    }
}
