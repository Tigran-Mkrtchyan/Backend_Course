package am.picsart.lesson4.first_task.services;

import am.picsart.lesson4.first_task.model.FootBollPlayer;
import am.picsart.lesson4.first_task.model.Game;
import am.picsart.lesson4.first_task.model.Team;

public class GameService {
    private int team1Point;
    private int team2Point;
    private Team currentTeam;
    private FootBollPlayer currentPlayer;
    private final RefereeService rs;
    private final PlayerService ps;
    private final static int GAME_ACTION_C0UNT = 20;

    public GameService(RefereeService rs, PlayerService ps) {
        this.rs = rs;
        this.ps = ps;
    }

    public String getScore(Game game) {
        return game.getTeam1().getName() + " " + team1Point + " : " + team2Point + " " + game.getTeam2().getName();
    }

    public String getWinner(Game game) {
        return team1Point > team2Point ? game.getTeam1().getName() : team1Point < team2Point ? game.getTeam2().getName() : "equal game";
    }

    public void play(Game game) {
        rs.startGame(game.getReferee());
        int currentAction = 0;
        currentTeam = game.getTeam1();
        while (isGameFinish(currentAction++)) {
            currentPlayer = TeamService.getActivePlayer(currentTeam);
            String action = ps.play(currentPlayer);
            String result = analyzeAction(game, action);
            if (result.equals("change")) {
                currentTeam = getConcurrentTeam(game, currentTeam);
            } else if (result.equals("change player")) {
                TeamService.changePlayer(currentTeam, currentPlayer);
            }
        }
        rs.finishGame(game.getReferee(), game);
    }

    private String analyzeAction(Game game, String action) {
        System.out.println(currentPlayer.getFirstName() + "  from " + currentTeam.getName() + " action " + action);
        if (action.equals("send pass") || action.equals("send long pass")) {
            return "continue";
        }
        if (action.equals("tired")) {
            return "change player";
        }
        String result = rs.stopGame(game.getReferee(), action);
        if (result.equals("yellow card")) {
            int countOfYellowCard = PlayerService.addYellowCard(currentPlayer);
            if (countOfYellowCard > 1) {
                removePlayerFromGame();
            }
        } else if (result.equals("goal")) {
            setPoint(game, currentTeam);
        }
        return "change";
    }

    private void removePlayerFromGame() {
        System.out.printf("%s leave game\n", currentPlayer.getFirstName());
        currentPlayer.setActivePlayer(false);
    }

    public boolean isGameFinish(int currentAction) {

        return GAME_ACTION_C0UNT - currentAction > 0;

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

    public static void resetGame(Game game) {
        TeamService.resetTeam(game.getTeam1());
        TeamService.resetTeam(game.getTeam2());
    }

}
