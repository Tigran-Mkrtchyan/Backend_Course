package am.picsart.lesson4.first_task.services;

import am.picsart.lesson4.first_task.model.Actions;
import am.picsart.lesson4.first_task.model.Football;
import am.picsart.lesson4.first_task.model.Referee;
import am.picsart.lesson4.first_task.model.RefereeActions;

import java.util.Arrays;
import java.util.List;

public class RefereeService implements Inspectable {
    private static final List<Actions> rougeFouls;

    static {
        rougeFouls = Arrays.asList(Actions.SIMULATION, Actions.HAND_PLAY, Actions.ROUGE_PLAY);
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
    public RefereeActions stopGame(Referee referee, Actions cause) {
        if (isFoulForYellowCard(cause)) {
            return RefereeActions.YEllOW_CARD;
        }
        if (cause.equals(Actions.SHOOT_ON_TARGET)) {
            return RefereeActions.GOAL;
        }
        return RefereeActions.FOUL;
    }

    private boolean isFoulForYellowCard(Actions cause) {
        for (Actions foul : rougeFouls) {
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
