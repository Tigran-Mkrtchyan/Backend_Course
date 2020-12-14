package am.picsart.lesson12.service;

import am.picsart.lesson12.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileService {
    public static List<Student> read(String url) {
        List<Student> students = new ArrayList<>();
        try {
            File file = new File(url);
            Scanner s = new Scanner(file);
            while (s.hasNext()){
                String[] studentInfo = s.nextLine().split("-");
                students.add(new Student(studentInfo[0],Integer.parseInt(studentInfo[1]),Integer.parseInt(studentInfo[2])));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
        return  students;
    }

    public static void write(String url,String context){

        try {
            FileWriter fileWriter = new FileWriter(url, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.append(context).append("\n");
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
