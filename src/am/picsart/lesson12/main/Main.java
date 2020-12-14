package am.picsart.lesson12.main;

import am.picsart.lesson12.model.Student;
import am.picsart.lesson12.service.FileService;
import am.picsart.lesson12.service.StudentService;

import java.util.List;

public class Main {
    private static final String URL = "C:\\Users\\Galust\\Desktop\\students.txt";

    public static void main(String[] args) {
        List<Student> students = FileService.read(URL);
        Student maxAge = StudentService.maxAge(students);
        FileService.write(URL, "max age: " + maxAge);

        Student minMark = StudentService.withMinMark(students);
        FileService.write(URL, "min mark: " + minMark);

        StudentService.sortByName(students);
        FileService.write(URL, "Sorted by names: " + StudentService.getStudentsInfo(students));

        StudentService.sortByMark(students);
        FileService.write(URL, "Sorted by mark: " + StudentService.getStudentsInfo(students));

    }
}
