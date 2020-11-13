package am.picsart.lesson4.first_task.main;

import am.picsart.lesson4.first_task.model.FootBollPlayer;
import am.picsart.lesson4.first_task.model.PlayerManager;
import am.picsart.lesson4.first_task.model.Referee;

public class Main {
    public static void main(String[] args) {
        System.out.println("Creating first player ....................");
        FootBollPlayer footBollPlayer1 = new FootBollPlayer("Tibo", "Curtua", 25);
        footBollPlayer1.setPlayingNumber(1);
        footBollPlayer1.setPosition("goalkeeper");
        System.out.println(footBollPlayer1);
        footBollPlayer1.printInfo();
        System.out.println("................................................................");

        System.out.println("Creating second player ....................");
        FootBollPlayer footBollPlayer2 = new FootBollPlayer("Marco", "Asensio", 24);
        footBollPlayer2.setPlayingNumber(11);
        footBollPlayer2.setPosition("right winger");
        System.out.println("................................................................");

        System.out.println("Creating Referee");
        Referee referee = new Referee("Khavier", "Estrada", 32);
        referee.setMainReferee(true);
        referee.printInfo();
        System.out.println("................................................................");

        System.out.println("Creating manager ");
        PlayerManager playerManager = new PlayerManager("Mino", "Raiola", 53);
        FootBollPlayer[] footBollPlayers = {footBollPlayer1, footBollPlayer2};
        playerManager.setPlayers(footBollPlayers);
        playerManager.printInfo();
        System.out.println();

    }
}
