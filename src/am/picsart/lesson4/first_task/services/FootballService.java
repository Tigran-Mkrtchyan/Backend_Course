package am.picsart.lesson4.first_task.services;

import am.picsart.lesson4.first_task.model.Football;
import am.picsart.lesson4.first_task.model.FootballPlayer;
import am.picsart.lesson4.first_task.model.Team;

import java.io.IOException;

public class FootballService {
    private Team currentTeam;
    private FootballPlayer currentPlayer;
    private final RefereeService rs;
    private final PlayerService fs;
    private final Football football;
    private final static int GAME_ACTION_C0UNT = 20;

    public FootballService(Football football) {
        this.football = football;
        this.rs = new RefereeService();
        this.fs = new FootballPlayerService();
    }

    public static String getScore(Football football) {
        return football.getFirstTeamPoint() + " : " + football.getSecondTeamPoint();
    }

    public static String getWinner(Football football) {
        return football.getFirstTeamPoint() > football.getSecondTeamPoint() ? football.getFirstTeam().getName() : football.getFirstTeamPoint() < football.getSecondTeamPoint() ? football.getSecondTeam().getName() : "equal football";
    }

    public static void resetGame(Football football) {
        TeamService.resetTeam(football.getFirstTeam());
        TeamService.resetTeam(football.getSecondTeam());
    }

    public void play() throws IOException {
        rs.startGame(football.getReferee());
        int currentAction = 0;
        currentTeam = football.getFirstTeam();
        while (isGameFinish(currentAction++)) {
            currentPlayer = TeamService.getActivePlayer(currentTeam);
            String action = fs.play();
            String result = analyzeAction(action);
            if (result.equals("change")) {
                currentTeam = getConcurrentTeam(currentTeam);
            } else if (result.equals("change player")) {
                TeamService.changePlayer(currentTeam, currentPlayer);
            }
        }
        rs.finishGame(football.getReferee(), football);
    }

    private String analyzeAction(String action) throws IOException {
        FileService.saveAction(currentPlayer.getFirstName() + "  from " + currentTeam.getName() + " action " + action, true);
        if (action.equals("send pass") || action.equals("send long pass")) {
            return "continue";
        }
        if (action.equals("tired")) {
            return "change player";
        }
        String result = rs.stopGame(football.getReferee(), action);
        if (result.equals("yellow card")) {
            int countOfYellowCard = PlayerService.addYellowCard(currentPlayer);
            if (countOfYellowCard > 1) {
                removePlayerFromGame();
            }
        } else if (result.equals("goal")) {
            setPoint(football, currentTeam);
        }
        return "change";
    }

    private void removePlayerFromGame() throws IOException {
        FileService.saveAction(String.format("%s leave football", currentPlayer.getFirstName()), true);
        currentPlayer.setActivePlayer(false);
    }

    private boolean isGameFinish(int currentAction) {

        return GAME_ACTION_C0UNT - currentAction > 0;

    }

    private Team getConcurrentTeam(Team currentTeam) {
        return currentTeam.equals(football.getFirstTeam()) ? football.getSecondTeam() : football.getFirstTeam();
    }

    private void setPoint(Football football, Team team) throws IOException {
        FileService.saveAction(currentPlayer.getFirstName() + " from " + team.getName() + " shoot goal", true);
        if (team.equals(football.getFirstTeam())) {
            football.setFirstTeamPoint(football.getFirstTeamPoint() + 1);
        } else {
            football.setSecondTeamPoint(football.getSecondTeamPoint() + 1);
        }
    }

}
