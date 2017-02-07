package org.football.domain;

/**
 * Created by nmarmaridis on 07-Feb-17.
 */
public class Standing {

    private Integer position;
    private String teamName;
    private String crestURI;
    private Integer playedGames;
    private Integer points;
    private Integer goals;
    private Integer goalsAgainst;
    private Integer goalDifference;
    private Integer wins;
    private Integer draws;
    private Integer losses;
    private StandingHome home;
    private StandingAway away;


    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getCrestURI() {
        return crestURI;
    }

    public void setCrestURI(String crestURI) {
        this.crestURI = crestURI;
    }

    public Integer getPlayedGames() {
        return playedGames;
    }

    public void setPlayedGames(Integer playedGames) {
        this.playedGames = playedGames;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getGoals() {
        return goals;
    }

    public void setGoals(Integer goals) {
        this.goals = goals;
    }

    public Integer getGoalsAgainst() {
        return goalsAgainst;
    }

    public void setGoalsAgainst(Integer goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }

    public Integer getGoalDifference() {
        return goalDifference;
    }

    public void setGoalDifference(Integer goalDifference) {
        this.goalDifference = goalDifference;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public Integer getDraws() {
        return draws;
    }

    public void setDraws(Integer draws) {
        this.draws = draws;
    }

    public Integer getLosses() {
        return losses;
    }

    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    public StandingHome getHome() {
        return home;
    }

    public void setHome(StandingHome home) {
        this.home = home;
    }

    public StandingAway getAway() {
        return away;
    }

    public void setAway(StandingAway away) {
        this.away = away;
    }

    @Override
    public String toString() {
        return "Standing{" +
                "position=" + position +
                ", teamName='" + teamName + '\'' +
                ", crestURI='" + crestURI + '\'' +
                ", playedGames=" + playedGames +
                ", points=" + points +
                ", goals=" + goals +
                ", goalsAgainst=" + goalsAgainst +
                ", goalDifference=" + goalDifference +
                ", wins=" + wins +
                ", draws=" + draws +
                ", losses=" + losses +
                ", home=" + home +
                ", away=" + away +
                '}';
    }
}

