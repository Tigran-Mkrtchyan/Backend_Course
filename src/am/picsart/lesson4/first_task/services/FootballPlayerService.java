package am.picsart.lesson4.first_task.services;

import am.picsart.lesson4.first_task.model.Actions;
import am.picsart.lesson4.first_task.model.FootballPlayer;

import java.util.Random;

public class FootballPlayerService extends PlayerService {
    @Override
    public Actions play() {
        int actionIndex = new Random().nextInt(FootballPlayer.getActions().size());
        return FootballPlayer.getActions().get(actionIndex);
    }
}
