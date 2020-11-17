package am.picsart.lesson4.first_task.main;

import am.picsart.lesson4.first_task.model.*;
import am.picsart.lesson4.first_task.services.GameService;
import am.picsart.lesson4.first_task.services.PlayerService;
import am.picsart.lesson4.first_task.services.RefereeService;
import am.picsart.lesson4.first_task.services.TeamService;


public class Main {
    public static void main(String[] args) {

        FootBollPlayer footBollPlayer1 = new FootBollPlayer("Tibo", "Curtua", 25);
        footBollPlayer1.setPlayingNumber(1);
        footBollPlayer1.setPosition("goalkeeper");

        FootBollPlayer footBollPlayer2 = new FootBollPlayer("Marco", "Asensio", 24);
        footBollPlayer2.setPlayingNumber(2);
        footBollPlayer2.setPosition("right winger");

        FootBollPlayer footBollPlayer3 = new FootBollPlayer("Raul", "Garcia", 24);
        footBollPlayer3.setPlayingNumber(3);
        footBollPlayer3.setPosition("left winger");

        FootBollPlayer footBollPlayer4 = new FootBollPlayer("Oliver", "Can", 25);
        footBollPlayer4.setPlayingNumber(1);
        footBollPlayer4.setPosition("goalkeeper");

        FootBollPlayer footBollPlayer5 = new FootBollPlayer("Frank", "Riberi", 24);
        footBollPlayer5.setPlayingNumber(2);
        footBollPlayer5.setPosition("right winger");

        FootBollPlayer footBollPlayer6 = new FootBollPlayer("Arien", "Roben", 24);
        footBollPlayer6.setPlayingNumber(3);
        footBollPlayer6.setPosition("left winger");

        Referee referee = new Referee("Khavier", "Estrada", 32);
        referee.setMainReferee(true);

        Coach team1Coach = new Coach("Zinedin", "Zidan", 42);
        Coach team2Coach = new Coach("Mauritio", "Pochetino", 26);

        FootBollPlayer[] team1Players = {footBollPlayer1, footBollPlayer2, footBollPlayer3};
        FootBollPlayer[] team2Players = {footBollPlayer4, footBollPlayer5, footBollPlayer6};

        Team team1 = new Team(team1Players, team1Coach, "Real Madrid");
        Team team2 = new Team(team2Players, team2Coach, "Bavaria");

        Game real_bavaria = new Game(team1, team2, referee);

        PlayerService ps = new PlayerService();
        RefereeService rs = new RefereeService();
        TeamService ts = new TeamService();
        GameService gs = new GameService(rs,ps,ts);
        gs.play(real_bavaria,15);
        System.out.println("Winner : "+gs.getWinner(real_bavaria));
        System.out.println("Score : "+gs.getScore(real_bavaria));


    }
}
