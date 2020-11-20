package am.picsart.lesson6.task2.main;

import am.picsart.lesson6.task2.models.Student;
import am.picsart.lesson6.task2.services.FileLoadService;
import am.picsart.lesson6.task2.services.StudentService;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Please enter students file path");
        Scanner s = new Scanner(System.in);
        String path = s.nextLine();
        Student[] students = FileLoadService.loadStudentsFromFile(path);

        System.out.println("Print full names of students..................");
        StudentService.printFullNames(students);
        System.out.println("..............................................\n");

        System.out.println("Print all male students.......................");
        StudentService.printAllMales(students);
        System.out.println("..............................................\n");

        System.out.println("Print all female students who has mark greater then 50.4.......................");
        StudentService.printFemaleWithMarkMoreThan50_4(students);
        System.out.println("..............................................\n");

        System.out.println("Print student information having the minimal mark.......................");
        StudentService.printHavingMinMark(students);
        System.out.println("..............................................\n");

        System.out.println("Print biggest male student information.......................");
        StudentService.printBiggestMale(students);
        System.out.println("..............................................\n");

        System.out.println("Print students sorted by mark.......................");
        StudentService.printSortedByMark(students);
        System.out.println("..............................................\n");

        System.out.println("Print female students sorted by year.......................");
        StudentService.printFemaleSortedByYear(students);
        System.out.println("..............................................\n");

    }

}
