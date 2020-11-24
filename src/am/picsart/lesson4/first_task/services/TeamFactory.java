package am.picsart.lesson4.first_task.services;

import am.picsart.lesson4.first_task.model.Coach;
import am.picsart.lesson4.first_task.model.FootballPlayer;
import am.picsart.lesson4.first_task.model.Team;

public class TeamFactory {
    private static final Team[] teams;

    static {
        teams = new Team[4];
        teams[0] = createTeamReal();
        teams[1] = createTeamBavaria();
        teams[2] = createTeamLiverpool();
        teams[3] = createTeamParisSG();
    }

    public static String[] getTeamsName() {
        String[] names = new String[teams.length];
        for (int i = 0; i < teams.length; i++) {
            names[i] = teams[i].getName();
        }
        return names;
    }

    public static Team getTeam(int index) {
        return teams[index];
    }

    private static Team createTeamReal() {
        FootballPlayer footballPlayer1 = new FootballPlayer("Tibo", "Curtua", 25);
        footballPlayer1.setPlayingNumber(1);
        footballPlayer1.setPosition("goalkeeper");

        FootballPlayer footballPlayer2 = new FootballPlayer("Marco", "Asensio", 24);
        footballPlayer2.setPlayingNumber(2);
        footballPlayer2.setPosition("right winger");

        FootballPlayer footballPlayer3 = new FootballPlayer("Raul", "Garcia", 24);
        footballPlayer3.setPlayingNumber(3);
        footballPlayer3.setPosition("left winger");

        FootballPlayer footballPlayer4 = new FootballPlayer("David", "Backham", 35);
        footballPlayer4.setPlayingNumber(4);
        footballPlayer4.setPosition("central");


        FootballPlayer footballPlayer5 = new FootballPlayer("Cristiano", "Ronaldo", 33);
        footballPlayer5.setPlayingNumber(5);
        footballPlayer5.setPosition("central attack");

        FootballPlayer reservedPlayer1 = new FootballPlayer("Serxio", "Ramos", 35);
        reservedPlayer1.setPlayingNumber(6);
        reservedPlayer1.setPosition("left winger");


        FootballPlayer reservedPlayer2 = new FootballPlayer("Luka", "Modrich", 33);
        reservedPlayer2.setPlayingNumber(7);
        reservedPlayer2.setPosition("right winger");

        Coach coach = new Coach("Zinedin", "Zidan", 42);

        FootballPlayer[] players = {footballPlayer1, footballPlayer2, footballPlayer3, footballPlayer4, footballPlayer5};
        FootballPlayer[] reservePlayers = {reservedPlayer1, reservedPlayer2};

        return new Team(players, reservePlayers, coach, "Real Madrid");
    }

    private static Team createTeamBavaria() {

        FootballPlayer footballPlayer1 = new FootballPlayer("Oliver", "Can", 25);
        footballPlayer1.setPlayingNumber(1);
        footballPlayer1.setPosition("goalkeeper");

        FootballPlayer footballPlayer2 = new FootballPlayer("Frank", "Riberi", 24);
        footballPlayer2.setPlayingNumber(2);
        footballPlayer2.setPosition("right winger");

        FootballPlayer footballPlayer3 = new FootballPlayer("Arien", "Roben", 24);
        footballPlayer3.setPlayingNumber(3);
        footballPlayer3.setPosition("left winger");

        FootballPlayer footballPlayer4 = new FootballPlayer("Mario", "Gomes", 35);
        footballPlayer4.setPlayingNumber(4);
        footballPlayer4.setPosition("central");

        FootballPlayer footballPlayer5 = new FootballPlayer("Robert", "Levadovski", 33);
        footballPlayer5.setPlayingNumber(5);
        footballPlayer5.setPosition("central attack");

        FootballPlayer reservedPlayer = new FootballPlayer("Joshua", "Kimikh", 35);
        reservedPlayer.setPlayingNumber(6);
        reservedPlayer.setPosition("left winger");


        FootballPlayer reservedPlayer1 = new FootballPlayer("David", "Alaba", 33);
        reservedPlayer1.setPlayingNumber(7);
        reservedPlayer1.setPosition("right winger");

        Coach coach = new Coach("Mauritio", "Pochetino", 26);

        FootballPlayer[] players = {footballPlayer1, footballPlayer2, footballPlayer3, footballPlayer4, footballPlayer5};
        FootballPlayer[] reservePlayers = {reservedPlayer, reservedPlayer1};

        return new Team(players, reservePlayers, coach, "Bavaria");
    }
    private static Team createTeamLiverpool() {
        FootballPlayer footballPlayer1 = new FootballPlayer("Alisson", "Beaker", 25);
        footballPlayer1.setPlayingNumber(1);
        footballPlayer1.setPosition("goalkeeper");

        FootballPlayer footballPlayer2 = new FootballPlayer("Mohamed", "Salah", 24);
        footballPlayer2.setPlayingNumber(2);
        footballPlayer2.setPosition("right winger");

        FootballPlayer footballPlayer3 = new FootballPlayer("Van", "Deaik", 24);
        footballPlayer3.setPlayingNumber(3);
        footballPlayer3.setPosition("left winger");

        FootballPlayer footballPlayer4 = new FootballPlayer("Girmi", "Welnandum", 35);
        footballPlayer4.setPlayingNumber(4);
        footballPlayer4.setPosition("central");

        FootballPlayer footballPlayer5 = new FootballPlayer("Nabi", "Keyta", 33);
        footballPlayer5.setPlayingNumber(5);
        footballPlayer5.setPosition("central attack");

        FootballPlayer reservedPlayer1 = new FootballPlayer("Andrew", "Roberdson", 35);
        reservedPlayer1.setPlayingNumber(6);
        reservedPlayer1.setPosition("left winger");


        FootballPlayer reservedPlayer2 = new FootballPlayer("Robert", "Firmino", 33);
        reservedPlayer2.setPlayingNumber(7);
        reservedPlayer2.setPosition("right winger");

        Coach coach = new Coach("Klopp", "Jurgen", 42);

        FootballPlayer[] players = {footballPlayer1, footballPlayer2, footballPlayer3, footballPlayer4, footballPlayer5};
        FootballPlayer[] reservePlayers = {reservedPlayer1, reservedPlayer2};

        return new Team(players, reservePlayers, coach, "Liverpool");
    }
    private static Team createTeamParisSG() {
        FootballPlayer footballPlayer1 = new FootballPlayer("Kelnor", "Navas", 25);
        footballPlayer1.setPlayingNumber(1);
        footballPlayer1.setPosition("goalkeeper");

        FootballPlayer footballPlayer2 = new FootballPlayer("Kilian", "Mbappe", 24);
        footballPlayer2.setPlayingNumber(2);
        footballPlayer2.setPosition("right winger");

        FootballPlayer footballPlayer3 = new FootballPlayer("Anxel", "Dimaria", 24);
        footballPlayer3.setPlayingNumber(3);
        footballPlayer3.setPosition("left winger");

        FootballPlayer footballPlayer4 = new FootballPlayer("Neymar", "Jr", 35);
        footballPlayer4.setPlayingNumber(4);
        footballPlayer4.setPosition("central");

        FootballPlayer footballPlayer5 = new FootballPlayer("Verrati", "Marko", 33);
        footballPlayer5.setPlayingNumber(5);
        footballPlayer5.setPosition("central attack");

        FootballPlayer reservedPlayer1 = new FootballPlayer("Icardi", "Maurio", 35);
        reservedPlayer1.setPlayingNumber(6);
        reservedPlayer1.setPosition("left winger");


        FootballPlayer reservedPlayer2 = new FootballPlayer("Kimpabe", "Precnel", 33);
        reservedPlayer2.setPlayingNumber(7);
        reservedPlayer2.setPosition("right winger");

        Coach coach = new Coach("Tomas", "Tukhel", 42);

        FootballPlayer[] players = {footballPlayer1, footballPlayer2, footballPlayer3, footballPlayer4, footballPlayer5};
        FootballPlayer[] reservePlayers = {reservedPlayer1, reservedPlayer2};

        return new Team(players, reservePlayers, coach, "Paris SG");
    }


    public static int getTeamsCount() {
        return teams.length;
    }
}
