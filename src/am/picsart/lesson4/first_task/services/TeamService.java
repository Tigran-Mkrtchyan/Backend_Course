package am.picsart.lesson4.first_task.services;

import am.picsart.lesson4.first_task.model.FootBollPlayer;
import am.picsart.lesson4.first_task.model.Player;
import am.picsart.lesson4.first_task.model.Team;

import java.util.Random;

public class TeamService {

    public static void changePlayer(Team team, FootBollPlayer out) {
        FootBollPlayer in = getPlayerFromReserve(team, out);
        if (in == null) {
            return;
        }
        for (int i = 0; i < team.getPlayers().length; i++) {
            if (team.getPlayers()[i].equals(out)) {
                team.getPlayers()[i] = in;
            }
        }
    }

    public static FootBollPlayer getActivePlayer(Team team) {
        FootBollPlayer activePlayer;
        while (!(activePlayer = getPlayer(team)).isActivePlayer()) {

        }
        return activePlayer;
    }

    private static FootBollPlayer getPlayer(Team team) {
        int index = new Random().nextInt(team.getPlayers().length);
        return team.getPlayers()[index];
    }

    public static FootBollPlayer getPlayerFromReserve(Team team, FootBollPlayer out) {
        FootBollPlayer[] reserved = team.getReservedPlayers();
        for (int i = 0; i < reserved.length; i++) {
            if (!reserved[i].isChanged()) {
                FootBollPlayer temp = reserved[i];
                out.setChanged(true);
                reserved[i] = out;
                System.out.printf("Exchange: in place %s entered %s\n", out.getFirstName(), temp.getFirstName());
                return temp;
            }
        }
        return null;
    }

    public static void resetTeam(Team team1) {
        for (Player player : team1.getPlayers()) {
            PlayerService.resetPlayer(player);
        }
        for (Player player : team1.getReservedPlayers()) {
            PlayerService.resetPlayer(player);
        }
    }
}
