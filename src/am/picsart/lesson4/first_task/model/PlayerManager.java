package am.picsart.lesson4.first_task.model;

import java.util.ArrayList;
import java.util.List;

public class PlayerManager extends Human {
    private List<Player> players;

    public PlayerManager(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        players = new ArrayList<>();
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return super.toString() +
                "players=" + players;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(players);
    }
}