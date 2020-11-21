package am.picsart.lesson4.first_task.model;

public class Coach extends Human {
    private int salary;

    public Coach(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}
