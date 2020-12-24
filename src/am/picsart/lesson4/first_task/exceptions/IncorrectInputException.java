package am.picsart.lesson4.first_task.exceptions;

public class IncorrectInputException extends Exception {
    public IncorrectInputException(String message, Exception e) {
        super(message,e);
    }
}
