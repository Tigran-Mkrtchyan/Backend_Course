package am.picsart.lesson4.first_task.services;

import am.picsart.lesson4.first_task.model.FootballPlayer;
import am.picsart.lesson4.first_task.model.Player;
import am.picsart.lesson4.first_task.model.Team;

import java.util.List;
import java.util.Random;

public class TeamService {

    public static void changePlayer(Team team, FootballPlayer out) {
        FootballPlayer in = getPlayerFromReserve(team, out);
        if (in == null) {
            return;
        }
        for (int i = 0; i < team.getPlayers().size(); i++) {
            if (team.getPlayers().get(i).equals(out)) {
                team.getPlayers().set(i, in);
            }
        }
    }

    public static FootballPlayer getActivePlayer(Team team) {
        FootballPlayer activePlayer;
        while (!(activePlayer = getPlayer(team)).isActivePlayer()) ;
        return activePlayer;
    }

    private static FootballPlayer getPlayer(Team team) {
        int index = new Random().nextInt(team.getPlayers().size());
        return team.getPlayers().get(index);
    }

    public static FootballPlayer getPlayerFromReserve(Team team, FootballPlayer out) {
        List<FootballPlayer> reserved = team.getReservedPlayers();
        for (int i = 0; i < reserved.size(); i++) {
            if (!reserved.get(i).isChanged()) {
                FootballPlayer temp = reserved.get(i);
                out.setChanged(true);
                reserved.set(i,out);
                FileService.saveAction(String.format("Exchange: in place %s entered %s", out.getFirstName(), temp.getFirstName()), true);
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
