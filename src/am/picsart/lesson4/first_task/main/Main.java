package am.picsart.lesson4.first_task.main;

import am.picsart.lesson4.first_task.model.*;
import am.picsart.lesson4.first_task.services.GameService;
import am.picsart.lesson4.first_task.services.PlayerService;
import am.picsart.lesson4.first_task.services.RefereeService;


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

        FootBollPlayer footBollPlayer4 = new FootBollPlayer("David", "Backham", 35);
        footBollPlayer4.setPlayingNumber(4);
        footBollPlayer4.setPosition("central");


        FootBollPlayer footBollPlayer5 = new FootBollPlayer("Cristiano", "Ronaldo", 33);
        footBollPlayer5.setPlayingNumber(5);
        footBollPlayer5.setPosition("central attack");

        FootBollPlayer reservedPlayer1 = new FootBollPlayer("Serxio", "Ramos", 35);
        footBollPlayer4.setPlayingNumber(6);
        footBollPlayer4.setPosition("left winger");


        FootBollPlayer reservedPlayer2 = new FootBollPlayer("Luka", "Modrich", 33);
        footBollPlayer5.setPlayingNumber(7);
        footBollPlayer5.setPosition("right winger");

        FootBollPlayer footBollPlayer6 = new FootBollPlayer("Arien", "Roben", 24);
        footBollPlayer6.setPlayingNumber(3);
        footBollPlayer6.setPosition("left winger");


        FootBollPlayer footBollPlayer7 = new FootBollPlayer("Oliver", "Can", 25);
        footBollPlayer7.setPlayingNumber(1);
        footBollPlayer7.setPosition("goalkeeper");

        FootBollPlayer footBollPlayer8 = new FootBollPlayer("Frank", "Riberi", 24);
        footBollPlayer8.setPlayingNumber(2);
        footBollPlayer8.setPosition("right winger");

        FootBollPlayer footBollPlayer9 = new FootBollPlayer("Mario", "Gomes", 35);
        footBollPlayer9.setPlayingNumber(4);
        footBollPlayer9.setPosition("central");

        FootBollPlayer footBollPlayer10 = new FootBollPlayer("Robert", "Levadovski", 33);
        footBollPlayer10.setPlayingNumber(5);
        footBollPlayer10.setPosition("central attack");

        FootBollPlayer reservedPlayer3 = new FootBollPlayer("joshua", "Kimix", 35);
        footBollPlayer4.setPlayingNumber(6);
        footBollPlayer4.setPosition("left winger");


        FootBollPlayer reservedPlayer4 = new FootBollPlayer("David", "Alaba", 33);
        footBollPlayer5.setPlayingNumber(7);
        footBollPlayer5.setPosition("right winger");


        Referee referee = new Referee("Khavier", "Estrada", 32);
        referee.setMainReferee(true);

        Coach team1Coach = new Coach("Zinedin", "Zidan", 42);
        Coach team2Coach = new Coach("Mauritio", "Pochetino", 26);

        FootBollPlayer[] team1Players = {footBollPlayer1, footBollPlayer2, footBollPlayer3, footBollPlayer4, footBollPlayer5};
        FootBollPlayer[] team1ReservePlayers = {reservedPlayer1, reservedPlayer2};
        FootBollPlayer[] team2Players = {footBollPlayer6, footBollPlayer7, footBollPlayer8, footBollPlayer9, footBollPlayer10};
        FootBollPlayer[] team2ReservePlayers = {reservedPlayer3, reservedPlayer4};

        Team team1 = new Team(team1Players, team1ReservePlayers, team1Coach, "Real Madrid");
        Team team2 = new Team(team2Players, team2ReservePlayers, team2Coach, "Bavaria");

        Game real_bavaria = new Game(team1, team2, referee);

        PlayerService ps = new PlayerService();
        RefereeService rs = new RefereeService();
        GameService gs = new GameService(rs, ps);
        gs.play(real_bavaria);
        System.out.println("Winner : " + gs.getWinner(real_bavaria));
        System.out.println("Score : " + gs.getScore(real_bavaria));


    }
}
