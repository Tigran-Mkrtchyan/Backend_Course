package am.picsart.lesson4.first_task.services;

import am.picsart.lesson4.first_task.model.Player;

import java.util.Random;

public class PlayerService implements Playable {

    @Override
    public int getPoint() {
        return 1;
    }

    @Override
    public String play(Player player) {
        int actionIndex = new Random().nextInt(player.getActions().length);
        return player.getActions()[actionIndex];
    }

    public void addYellowCard(Player player) {
        int count = player.getYellowCardCount();
        if (count > 0) {
            System.out.println(player.getFirstName() + " must leave game");// then will add this functionality;
        }
        System.out.println(player.getFirstName() + " get yellow card");// then will add this functionality
        player.setYellowCardCount(++count);
    }
}
