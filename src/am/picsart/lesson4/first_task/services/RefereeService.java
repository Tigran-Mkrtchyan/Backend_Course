package am.picsart.lesson4.first_task.services;

import am.picsart.lesson4.first_task.model.Football;
import am.picsart.lesson4.first_task.model.Referee;

public class RefereeService implements Inspectable {
    private final String[] rougeFouls;

    public RefereeService() {
        rougeFouls = new String[]{"simulation", "hand play", "rouge play"};
    }

    @Override
    public void startGame(Referee referee) {
        System.out.println("Start game");
    }

    @Override
    public void finishGame(Referee referee, Football football) {
        FootballService.resetGame(football);
        System.out.println("Finish football");
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

    public static Referee getRefereeEstrada() {
        Referee referee = new Referee("Khavier", "Estrada", 32);
        referee.setMainReferee(true);
        return referee;
    }
}
