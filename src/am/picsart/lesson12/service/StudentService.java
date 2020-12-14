package am.picsart.lesson12.service;

import am.picsart.lesson12.model.Student;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentService {
    public static Student withMinMark(List<Student> students) {
        Student withMinMark = students.get(0);
        for (int i = 1; i < students.size(); i++) {
            if (withMinMark.getMark() > students.get(i).getMark()) {
                withMinMark = students.get(i);
            }
        }
        return withMinMark;
    }

    public static Student maxAge(List<Student> students) {
        Student withMaxAge = students.get(0);
        for (int i = 1; i < students.size(); i++) {
            if (withMaxAge.getYear() > students.get(i).getYear()) {
                withMaxAge = students.get(i);
            }
        }
        return withMaxAge;
    }

    public static void sortByName(List<Student> students) {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    public static void sortByMark(List<Student> students) {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getMark() - o2.getMark();
            }
        });
    }

    public static String getStudentsInfo(List<Student> students) {
        StringBuilder sb = new StringBuilder();
        for (Student student : students) {
            sb.append(student).append(" ");
        }
        return sb.toString();
    }
}
