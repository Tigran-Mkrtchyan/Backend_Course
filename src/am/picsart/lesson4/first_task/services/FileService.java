package am.picsart.lesson4.first_task.services;

import java.io.*;
import java.util.Scanner;

public class FileService {
    private final static String PATH_HISTORY = "src\\am\\picsart\\lesson4\\first_task\\history.txt";
    private final static String PATH_ACTIONS = "src\\am\\picsart\\lesson4\\first_task\\actions.txt";

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
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(PATH_HISTORY, isAppend);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
        save(fileWriter, info);
    }

    public static void saveAction(String action, boolean isAppend) {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(PATH_ACTIONS, isAppend);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
        save(fileWriter, action);
    }

    private static void save(FileWriter fileWriter, String info) {
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.append(info).append("\n");
        printWriter.close();
    }
}
