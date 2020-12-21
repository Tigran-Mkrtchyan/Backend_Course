package am.picsart.lesson4.first_task.services;

import am.picsart.lesson4.first_task.model.Actions;
import am.picsart.lesson4.first_task.model.Football;
import am.picsart.lesson4.first_task.model.Referee;
import am.picsart.lesson4.first_task.model.RefereeActions;

public interface Inspectable {

    void startGame(Referee referee);

    void finishGame(Referee referee, Football football);

    RefereeActions stopGame(Referee referee, Actions cause);

}

