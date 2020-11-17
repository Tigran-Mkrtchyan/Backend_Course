package am.picsart.lesson4.first_task.services;

import am.picsart.lesson4.first_task.model.Game;
import am.picsart.lesson4.first_task.model.Player;
import am.picsart.lesson4.first_task.model.Team;

public class GameService {
    private int team1Point;
    private int team2Point;
    private Team currentTeam;
    private Player currentPlayer;
    private RefereeService rs;
    private PlayerService ps;
    private TeamService ts;

    public GameService(RefereeService rs, PlayerService ps, TeamService ts) {
        this.rs = rs;
        this.ps = ps;
        this.ts = ts;
    }

    public String getScore(Game game) {
        return game.getTeam1().getName() + " " + team1Point + " : " + team2Point + " " + game.getTeam2().getName();
    }

    public String getWinner(Game game) {
        return team1Point > team2Point ? game.getTeam1().getName() : team1Point < team2Point ? game.getTeam2().getName() : "equal game";
    }

    private String analyzeAction(Game game, String action) {
        System.out.println(currentPlayer.getFirstName() + "  from " + currentTeam.getName() + " action " + action);
        if (action.equals("send pass") || action.equals("send long pass")) {
            return "continue";
        }
        String result = rs.stopGame(game.getReferee(), action);
        if (result.equals("yellow card")) {
            ps.addYellowCard(currentPlayer);
        } else if (result.equals("goal")) {
            setPoint(game, currentTeam);
        }
        return "change";
    }

    public void play(Game game, int countOfAction) {
        rs.startGame(game.getReferee());
        currentTeam = game.getTeam1();
        while (countOfAction > 0) {
            currentPlayer = ts.getPlayer(currentTeam);
            String action = ps.play(currentPlayer);
            String result = analyzeAction(game, action);
            if (result.equals("change")) {
                currentTeam = getConcurrentTeam(game, currentTeam);
            }
            countOfAction--;
        }
    }

    private Team getConcurrentTeam(Game game, Team currentTeam) {
        return currentTeam.equals(game.getTeam1()) ? game.getTeam2() : game.getTeam1();
    }

    private void setPoint(Game game, Team team) {
        System.out.println(currentPlayer.getFirstName() + " from " + team.getName() + " shoot goal");
        if (team.equals(game.getTeam1())) {
            team1Point++;
        } else {
            team2Point++;
        }
    }
}
