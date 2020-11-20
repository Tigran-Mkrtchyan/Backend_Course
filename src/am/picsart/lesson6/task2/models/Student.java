package am.picsart.lesson6.task2.models;

import java.util.Calendar;

public class Student {
    private String firstName;
    private String lastName;
    private int year = 1900;
    private char gender = 'm';
    private double mark;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        int maxYear = Calendar.getInstance().get(Calendar.YEAR);
        if (year >= 1900 && year <= maxYear)
            this.year = year;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender == 'f' || gender == 'm')
            this.gender = gender;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year=" + year +
                ", gender=" + gender +
                ", mark=" + mark +
                '}';
    }
}
