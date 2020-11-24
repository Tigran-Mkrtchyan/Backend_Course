package am.picsart.lesson4.first_task.services;

import am.picsart.lesson4.first_task.model.FootballPlayer;

import java.util.Random;

public class FootballPlayerService extends PlayerService {
    @Override
    public String play() {
        int actionIndex = new Random().nextInt(FootballPlayer.getActions().length);
        return FootballPlayer.getActions()[actionIndex];
    }
}
