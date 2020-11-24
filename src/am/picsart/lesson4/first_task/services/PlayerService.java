package am.picsart.lesson4.first_task.services;

import am.picsart.lesson4.first_task.model.Player;

import java.io.IOException;

public abstract class PlayerService implements Playable {

    public static int addYellowCard(Player player) throws IOException {
        int count = player.getYellowCardCount();
        if (count > 0) {
            return ++count;
        }
        FileService.saveAction(player.getFirstName() + " get yellow card", true);
        player.setYellowCardCount(++count);
        return count;
    }

    public static void resetPlayer(Player player) {
        player.setYellowCardCount(0);
        player.setActivePlayer(true);
    }
}
