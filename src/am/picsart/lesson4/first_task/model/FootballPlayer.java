package am.picsart.lesson4.first_task.model;

public class FootballPlayer extends Player {
    private String position;
    private boolean isChanged;
    private static  String[] actions;

    public FootballPlayer(String firstName, String lastName, int age) {

        super(firstName, lastName, age);
        actions = new String[]{"simulation", "hand play",
                "rouge play", "send pass", "send long pass",
                "shot near target",
                "foul", "take bool", "shoot on target", "tired"};
    }

    public String getPosition() {
        return position;
    }
    public static String[] getActions() {
        String[] copyActions = new String[actions.length];
        System.arraycopy(actions, 0, copyActions, 0, actions.length);
        return copyActions;
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
