package am.picsart.lesson4.first_task.model;

public class FootBollPlayer extends Player {
    private String position;
    private boolean isChanged;

    public FootBollPlayer(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isChanged() {
        return isChanged;
    }

    public void setChanged(boolean changed) {
        isChanged = changed;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Position is " + position);
    }

    @Override
    public String toString() {
        return super.toString() +
                " position=" + position;
    }

}
