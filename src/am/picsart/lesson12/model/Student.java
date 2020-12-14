package am.picsart.lesson12.model;

public class Student {
    private String name;
    private int mark;
    private int year;

    public Student(String name, int age, int year) {
        this.name = name;
        this.mark = age;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return new StringBuilder(name+",").append(mark+",").append(year+"").toString();
    }
}
