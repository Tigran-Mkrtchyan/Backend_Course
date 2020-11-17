package am.picsart.lesson4.first_task.services;

import am.picsart.lesson4.first_task.model.Referee;

public class RefereeService implements Inspectable {
    private String[] rougeFouls;

    public RefereeService(){
        rougeFouls = new String[]{"simulation", "hand play", "rouge play"};
    }

    public void startGame(Referee referee) {
        System.out.println("Start game");
    }


    public void finishGame(Referee referee) {
        System.out.println("Finish game");
    }


    public String stopGame(Referee referee,String cause) {
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
