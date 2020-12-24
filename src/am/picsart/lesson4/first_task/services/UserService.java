package am.picsart.lesson4.first_task.services;

import am.picsart.lesson4.first_task.exceptions.*;
import am.picsart.lesson4.first_task.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserService {
    private static Map<String, User> users;
    private final static Scanner S;

    static {
        init();
        S = new Scanner(System.in);
    }

    public static void login() throws UserAuthenticationException {
        System.out.println("Please enter username");
        String username = S.nextLine();
        System.out.println("Please enter password");
        String password = S.nextLine();
        UserService.loginUser(username, password);
    }

    private static void loginUser(String username, String password) throws UserAuthenticationException {
        if (!users.containsKey(username)) {
            init();
            if (!users.containsKey(username)) {
                throw new UserAuthenticationException("incorrect username or password");
            }
        }
        User user = users.get(username);
        if (user.getPassword().equals(Validation.md5FormatString(password))) {
            throw new UserAuthenticationException("incorrect username or password");
        }
    }

    public static void register() throws IncorrectInputException {
        System.out.println("Please enter full name");
        String fullName = S.nextLine();
        System.out.println("Please enter username");
        String username = S.nextLine();
        System.out.println("Please enter email");
        String email = S.nextLine();
        System.out.println("Please enter password");
        String password = S.nextLine();
        try {
            registerUser(fullName, username, email, password);
        } catch (IncorrectUsernameFormatException | IncorrectEmailFormatException | IncorrectPasswordFormatException | UsernameAlreadyExistException e) {
            throw new IncorrectInputException(e.getMessage(),e);
        }
    }

    private static void registerUser(String fullname, String username, String email, String password) throws UsernameAlreadyExistException, IncorrectEmailFormatException, IncorrectPasswordFormatException, IncorrectUsernameFormatException {
        if (users.containsKey(username)) {
            throw new UsernameAlreadyExistException("Username already exist");
        }
        if (!Validation.isCorrectUsername(username)) {
            throw new IncorrectUsernameFormatException("Username must be more than 9 letter");
        }
        if (!Validation.isEmail(email)) {
            throw new IncorrectEmailFormatException("your email is not correct");
        }
        if (!Validation.isCorrectPassWord(password)) {
            throw new IncorrectPasswordFormatException("Password must be more than 7 symbol, contains two uppercase letter and 3 digits");
        }
        User user = new User(fullname, username, email, password);
        FileService.saveUser(user);
        users.put(username, user);
    }

    private static void init() {
        users = new HashMap<>();
        List<String> usersInfo = FileService.readDatabaseInfo();
        for (String line : usersInfo) {
            String[] userInfo = line.split(":");
            try {
                users.put(userInfo[1], new User(userInfo[0], userInfo[1], userInfo[2], userInfo[3]));
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException();
            }
        }
    }
}
