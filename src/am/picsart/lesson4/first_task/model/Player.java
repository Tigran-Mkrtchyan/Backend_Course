package am.picsart.lesson4.first_task.model;

public class Player extends Human {

    private int playingNumber;
    private int salary;
    private int yellowCardCount;
    private static String[] actions;
    private boolean isActivePlayer = true;


    public Player(String firstName, String lastName, int age) {

        super(firstName, lastName, age);
        actions = new String[]{"simulation", "hand play",
                "rouge play", "send pass", "send long pass",
                "shot near target",
                "foul", "take bool", "shoot on target", "tired"};
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

    public int getYellowCardCount() {
        return yellowCardCount;
    }

    public void setYellowCardCount(int yellowCardCount) {
        this.yellowCardCount = yellowCardCount;
    }

    public static String[] getActions() {
        String[] copyActions = new String[actions.length];
        System.arraycopy(actions, 0, copyActions, 0, actions.length);
        return copyActions;
    }

    public boolean isActivePlayer() {
        return isActivePlayer;
    }

    public void setActivePlayer(boolean activePlayer) {
        isActivePlayer = activePlayer;
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
