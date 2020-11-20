package am.picsart.lesson6.task2.services;

import am.picsart.lesson6.task2.models.Student;

public class StudentService {
    //Task1
    public static void printFullNames(Student[] students) {
        for (Student student : students) {
            System.out.printf("%s %s\n", student.getFirstName(), student.getLastName());
        }
    }

    //Task2
    public static void printAllMales(Student[] students) {
        for (Student student : students) {
            if (student.getGender() == 'm') {
                System.out.println(student);
            }
        }
    }

    //Task3
    public static void printFemaleWithMarkMoreThan50_4(Student[] students) {
        for (Student student : students) {
            if (student.getGender() == 'f' && student.getMark() > 50.4) {
                System.out.println(student);
            }
        }
    }

    //Task4
    public static void printHavingMinMark(Student[] students) {
        Student withMinMark = students[0];
        for (int i = 1; i < students.length; i++) {
            if (withMinMark.getMark() > students[i].getMark()) {
                withMinMark = students[i];
            }
        }
        System.out.println(withMinMark);
    }

    //Task5
    public static void printBiggestMale(Student[] students) {
        Student biggestMale = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].getGender() == 'm' && biggestMale.getYear() > students[i].getYear()) {
                biggestMale = students[i];
            }
        }
        if (biggestMale.getGender() == 'm') {
            System.out.println(biggestMale);
        } else {
            System.out.println("there are no male student");
        }
    }

    //Task6
    public static void printSortedByMark(Student[] students) {
        int size = students.length - 1;
        boolean isDoAnyChanges = true;
        while (isDoAnyChanges) {
            isDoAnyChanges = false;
            for (int i = 0; i < size; i++) {
                if (students[i].getMark() > students[i + 1].getMark()) {
                    Student temp = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = temp;
                }
            }
            size--;
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }

    //Task7
    public static void printFemaleSortedByYear(Student[] students) {
        int size = students.length - 1;
        boolean isDoAnyChanges = true;
        while (isDoAnyChanges) {
            isDoAnyChanges = false;
            for (int i = 0; i < size; i++) {
                if (students[i].getYear() > students[i + 1].getYear()) {
                    Student temp = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = temp;
                }
            }
            size--;
        }
        for (Student student : students) {
            if (student.getGender() == 'f')
                System.out.println(student);
        }
    }

    private static Student createStudent(String studentDetailsString) {
        String[] studentDetails = studentDetailsString.split(",");
        Student student = new Student();
        student.setFirstName(studentDetails[0]);
        student.setLastName(studentDetails[1]);
        student.setYear(Integer.parseInt(studentDetails[2]));
        student.setGender(studentDetails[3].charAt(0));
        student.setMark(Double.parseDouble(studentDetails[4]));
        return student;
    }

    public static Student[] createStudents(String[] studentDetailsCollection) {
        Student [] students = new Student[studentDetailsCollection.length];
        for (int i = 0; i < students.length; i++) {
            students[i]=createStudent(studentDetailsCollection[i]);
        }
        return students;
    }

    public static void main(String[] args) {
        Student s = createStudent("Hayk,abraamyan,1988,m,77.5");
        System.out.println(s);
    }

}
