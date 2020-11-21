package am.picsart.lesson4.first_task.model;

public class Team {
    private FootBollPlayer[] players;
    private final FootBollPlayer[] reservedPlayers;
    private Coach coach;
    private String name;


    public Team(FootBollPlayer[] players, FootBollPlayer[] reservedPlayers, Coach coach, String name) {
        this.players = players;
        this.reservedPlayers = reservedPlayers;
        this.coach = coach;
        this.name = name;
    }

    public FootBollPlayer[] getPlayers() {
        return players;
    }

    public void setPlayers(FootBollPlayer[] players) {
        this.players = players;
    }

    public FootBollPlayer[] getReservedPlayers() {
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
