package am.picsart.lesson6.task2.services;

import am.picsart.lesson6.task2.models.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileLoadService {
    public static Student[] loadStudentsFromFile(String url) throws FileNotFoundException {

        File file = new File(url);
        Scanner scanner = new Scanner(file);
        StringBuilder sb = new StringBuilder();

        while (scanner.hasNext()) {
            sb.append(scanner.nextLine()).append("\n");
        }

        String[] studentDetailsCollection = sb.toString().split("\n");
        return StudentService.createStudents(studentDetailsCollection);
    }
}
