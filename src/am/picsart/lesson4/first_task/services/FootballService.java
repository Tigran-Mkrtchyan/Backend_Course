package am.picsart.lesson4.first_task.services;

import am.picsart.lesson4.first_task.model.*;

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

    public void play() {
        rs.startGame(football.getReferee());
        int currentAction = 0;
        currentTeam = football.getFirstTeam();

        while (isGameFinish(currentAction++)) {
            currentPlayer = TeamService.getActivePlayer(currentTeam);
            Actions action = fs.play();
            GameActions result = analyzeAction(action);
            if (result.equals(GameActions.LOSE_BALL)) {
                currentTeam = getConcurrentTeam(currentTeam);
            } else if (result.equals(GameActions.CHANGE_PLAYER)) {
                TeamService.changePlayer(currentTeam, currentPlayer);
            }
        }
        rs.finishGame(football.getReferee(), football);
    }

    private GameActions analyzeAction(Actions action) {
        FileService.saveAction(String.format("%s from %s ", currentPlayer.getFirstName(), action), true);

        if (action.equals(Actions.SEND_PASS) || action.equals(Actions.SEND_LONG_PASS)) {
            return GameActions.CONTINUE;
        }

        if (action.equals(Actions.TIRED)) {
            return GameActions.CHANGE_PLAYER;
        }

        RefereeActions result = rs.stopGame(football.getReferee(), action);

        if (result.equals(RefereeActions.YEllOW_CARD)) {
            int countOfYellowCard = PlayerService.addYellowCard(currentPlayer);
            if (countOfYellowCard > 1) {
                removePlayerFromGame();
            }
        } else if (result.equals(RefereeActions.GOAL)) {
            setPoint(football, currentTeam);
        }
        return GameActions.LOSE_BALL;
    }

    private void removePlayerFromGame() {
        FileService.saveAction(String.format("%s leave game", currentPlayer.getFirstName()), true);
        currentPlayer.setActivePlayer(false);
    }

    private boolean isGameFinish(int currentAction) {
        return GAME_ACTION_C0UNT - currentAction > 0;
    }

    private Team getConcurrentTeam(Team currentTeam) {
        return currentTeam.equals(football.getFirstTeam()) ? football.getSecondTeam() : football.getFirstTeam();
    }

    private void setPoint(Football football, Team team) {
        FileService.saveAction(String.format(" %s from %s shoot goal", currentPlayer.getFirstName(), team.getName()), true);

        if (team.equals(football.getFirstTeam())) {
            football.setFirstTeamPoint(football.getFirstTeamPoint() + 1);
        } else {
            football.setSecondTeamPoint(football.getSecondTeamPoint() + 1);
        }
    }

}
