package am.picsart.lesson4.first_task.services;

import am.picsart.lesson4.first_task.model.FootBollPlayer;
import am.picsart.lesson4.first_task.model.Team;

import java.util.Random;

public class TeamService {
    public void changePlayer(Team team, FootBollPlayer in, FootBollPlayer out) {
        for (int i = 0; i < team.getPlayers().length; i++) {
            if (team.getPlayers()[i].equals(out)) {
                team.getPlayers()[i] = in;
            }
        }
    }

    public FootBollPlayer getPlayer(Team team) {
        int index = new Random().nextInt(team.getPlayers().length);
        return team.getPlayers()[index];
    }
}
