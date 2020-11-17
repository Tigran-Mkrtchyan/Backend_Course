package am.picsart.lesson4.first_task.model;

public class Team {
    private FootBollPlayer[] players;
    private Coach coach;
    private String name;

    public Team(FootBollPlayer[] players, Coach coach, String name) {
        this.players = players;
        this.coach = coach;
        this.name = name;
    }

    public FootBollPlayer[] getPlayers() {
        return players;
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
