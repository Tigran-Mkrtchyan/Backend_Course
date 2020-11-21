package am.picsart.lesson4.first_task.services;

import am.picsart.lesson4.first_task.model.Player;

import java.util.Random;

public class PlayerService implements Playable {

    @Override
    public String play(Player player) {
        int actionIndex = new Random().nextInt(Player.getActions().length);
        return Player.getActions()[actionIndex];
    }

    public static int addYellowCard(Player player) {
        int count = player.getYellowCardCount();
        if (count > 0) {
            return ++count;
        }
        System.out.println(player.getFirstName() + " get yellow card");
        player.setYellowCardCount(++count);
        return count;
    }

    public static void resetPlayer(Player player) {
        player.setYellowCardCount(0);
        player.setActivePlayer(true);
    }
}
