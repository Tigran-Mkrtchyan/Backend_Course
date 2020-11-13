package am.picsart.lesson4.first_task.model;

import java.util.Arrays;

public class PlayerManager extends Human {
    private Player[] players;

    public PlayerManager(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        players = new Player[5];
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return super.toString()+
                "players=" + Arrays.toString(players) ;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(Arrays.toString(players));
    }
}