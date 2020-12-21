package am.picsart.lesson4.first_task.model;

import java.util.List;

public class Team {
    private List<FootballPlayer> players;
    private List<FootballPlayer> reservedPlayers;
    private Coach coach;
    private String name;


    public Team(List<FootballPlayer> players, List<FootballPlayer> reservedPlayers, Coach coach, String name) {
        this.players = players;
        this.reservedPlayers = reservedPlayers;
        this.coach = coach;
        this.name = name;
    }

    public void setPlayers(List<FootballPlayer> players) {
        this.players = players;
    }

    public List<FootballPlayer> getPlayers() {
        return players;
    }

    public List<FootballPlayer> getReservedPlayers() {
        return reservedPlayers;
    }

    public void setReservedPlayers(List<FootballPlayer> reservedPlayers) {
        this.reservedPlayers = reservedPlayers;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
