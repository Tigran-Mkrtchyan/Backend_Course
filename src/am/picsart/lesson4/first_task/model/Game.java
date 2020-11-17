package am.picsart.lesson4.first_task.model;

public class Game {
    private Team team1;
    private Team team2;
    private Referee referee;


    public Game(Team team1, Team team2, Referee referee) {
        this.team1 = team1;
        this.team2 = team2;
        this.referee = referee;
    }

    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public Referee getReferee() {
        return referee;
    }



}
