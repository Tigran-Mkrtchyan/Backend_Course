package am.picsart.lesson4.first_task.main;


import am.picsart.lesson4.first_task.exceptions.*;
import am.picsart.lesson4.first_task.services.*;
import java.util.Scanner;

public class Main {
    private final static Scanner S;

    static {
        S = new Scanner(System.in);
    }

    public static void main(String[] args) {
        System.out.println("welcome to football game");
        boolean isActive = true;
        while (isActive) {
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            int number = S.nextInt();
            S.nextLine();
            switch (number) {
                case 1:
                    login();
                    break;
                case 2:
                    register();
                    break;
                case 3:
                    isActive = false;
                    break;
                default:
                    System.out.println("Invalid button please choose again");
            }
        }
    }

    private static void register() {
        try {
            UserService.register();
            MenuService.getTitle();
        } catch (IncorrectInputException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void login() {
        try {
            UserService.login();
           MenuService.getTitle();
        } catch (UserAuthenticationException e) {
            System.out.println(e.getMessage());
        }
    }


}
