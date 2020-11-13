package am.picsart.lesson4.first_task.model;

public class Player extends Human {

    private int playingNumber;
    private int salary;


    public Player(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public int getPlayingNumber() {
        return playingNumber;
    }

    public void setPlayingNumber(int playingNumber) {
        this.playingNumber = playingNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Playing Number is " + playingNumber);
    }

    @Override
    public String toString() {
        return super.toString() +
                " playingNumber=" + playingNumber;
    }
}
