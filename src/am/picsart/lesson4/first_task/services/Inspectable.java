package am.picsart.lesson4.first_task.services;

import am.picsart.lesson4.first_task.model.Referee;

public interface Inspectable {

     void startGame(Referee referee) ;

     void finishGame(Referee referee) ;

     String stopGame(Referee referee,String cause) ;

}
