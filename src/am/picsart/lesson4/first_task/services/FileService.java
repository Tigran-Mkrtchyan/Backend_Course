package am.picsart.lesson4.first_task.services;

import am.picsart.lesson4.first_task.model.User;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class FileService {
    private final static String PATH_HISTORY = "src\\am\\picsart\\lesson4\\first_task\\history.txt";
    private final static String PATH_ACTIONS = "src\\am\\picsart\\lesson4\\first_task\\actions.txt";
    private final static String PATH_DATABASE = "src\\am\\picsart\\lesson4\\first_task\\database.txt";

    public static void showHistory() {
        File file = new File(PATH_HISTORY);
        show(file);
    }

    public static void showAction() {
        File file = new File(PATH_ACTIONS);
        show(file);
    }

    private static void show(File file) {
        Scanner s;
        try {
            s = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
        while (s.hasNext()) {
            System.out.println(s.nextLine());
        }
    }

    public static void saveHistory(String info, boolean isAppend) {

        try {
            FileWriter fileWriter = new FileWriter(PATH_HISTORY, isAppend);
            save(fileWriter, info);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    public static void saveAction(String action, boolean isAppend) {

        try {
            FileWriter fileWriter = new FileWriter(PATH_ACTIONS, isAppend);
            save(fileWriter, action);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }

    }

    private static void save(FileWriter fileWriter, String info) {
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.append(info).append("\n");
        printWriter.close();
    }

    public static void clearActionList() {
        saveAction("", false);
    }

    public static List<String> readDatabaseInfo() {
        try {
            return Files.readAllLines(Paths.get(PATH_DATABASE));
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    public static void saveUser(User user) {
        try {
            FileWriter fileWriter = new FileWriter(PATH_DATABASE,true);
            save(fileWriter,user.toString());
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
