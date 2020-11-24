package am.picsart.lesson4.first_task.model;

public class Team {
    private FootballPlayer[] players;
    private final FootballPlayer[] reservedPlayers;
    private Coach coach;
    private String name;


    public Team(FootballPlayer[] players, FootballPlayer[] reservedPlayers, Coach coach, String name) {
        this.players = players;
        this.reservedPlayers = reservedPlayers;
        this.coach = coach;
        this.name = name;
    }

    public FootballPlayer[] getPlayers() {
        return players;
    }

    public void setPlayers(FootballPlayer[] players) {
        this.players = players;
    }

    public FootballPlayer[] getReservedPlayers() {
        return reservedPlayers;
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
