package am.picsart.lesson4.first_task.services;

import am.picsart.lesson4.first_task.model.Game;
import am.picsart.lesson4.first_task.model.Referee;

public class RefereeService implements Inspectable {
    private String[] rougeFouls;

    public RefereeService() {

        rougeFouls = new String[]{"simulation", "hand play", "rouge play"};
    }

    @Override
    public void startGame(Referee referee) {
        System.out.println("Start game");
    }

    @Override
    public void finishGame(Referee referee, Game game) {
        GameService.resetGame(game);
        System.out.println("Finish game");
    }

    @Override
    public String stopGame(Referee referee, String cause) {
        if (isFoulForYellowCard(cause)) {
            return "yellow card";
        }
        if (cause.equals("shoot on target")) {
            return "goal";
        }
        return "foul";
    }

    private boolean isFoulForYellowCard(String cause) {
        for (String foul : rougeFouls) {
            if (foul.equals(cause)) {
                return true;
            }
        }
        return false;
    }
}
