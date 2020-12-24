package am.picsart.lesson4.first_task.exceptions;

public class UsernameAlreadyExistException extends Exception {
    public UsernameAlreadyExistException(String message) {
        super(message);
    }
}
