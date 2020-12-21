package am.picsart.lesson4.first_task.model;

import java.util.List;

public class FootballPlayer extends Player {
    private String position;
    private boolean isChanged;
    private static final List<Actions> actions;

    static {
        actions = Actions.getAllActions();
    }

    public FootballPlayer(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public String getPosition() {
        return position;
    }

    public static List<Actions> getActions() {
        return actions;
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
