package org.football.domain;

/**
 * Created by nmarmaridis on 07-Feb-17.
 */
public class StandingHome {

    private Integer goals;
    private Integer goalsAgainst;
    private Integer wins;
    private Integer draws;
    private Integer losses;

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

    @Override
    public String toString() {
        return "StandingHome{" +
                "goals=" + goals +
                ", goalsAgainst=" + goalsAgainst +
                ", wins=" + wins +
                ", draws=" + draws +
                ", losses=" + losses +
                '}';
    }
}
