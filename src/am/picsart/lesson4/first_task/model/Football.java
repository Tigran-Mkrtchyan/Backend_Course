package am.picsart.lesson4.first_task.model;

public class Football {

    private Team firstTeam;
    private Team secondTeam;
    private int firstTeamPoint;
    private int secondTeamPoint;
    private Referee referee;


    public Football(Team team1, Team team2, Referee referee) {
        this.firstTeam = team1;
        this.secondTeam = team2;
        this.referee = referee;
    }

    public Team getFirstTeam() {
        return firstTeam;
    }

    public Team getSecondTeam() {
        return secondTeam;
    }

    public Referee getReferee() {
        return referee;
    }

    public int getFirstTeamPoint() {
        return firstTeamPoint;
    }

    public int getSecondTeamPoint() {
        return secondTeamPoint;
    }

    public void setFirstTeamPoint(int firstTeamPoint) {
        this.firstTeamPoint = firstTeamPoint;
    }

    public void setSecondTeamPoint(int secondTeamPoint) {
        this.secondTeamPoint = secondTeamPoint;
    }
}
