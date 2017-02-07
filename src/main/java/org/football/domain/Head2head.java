package org.football.domain;

import java.util.List;

/**
 * Created by nmarmaridis on 07-Feb-17.
 */
public class Head2head {

    private Integer count;
    private String timeFrameStart;
    private String timeFrameEnd;
    private Integer homeTeamWins;
    private Integer awayTeamWins;
    private Integer draws;

    private Fixture lastHomeWinHomeTeam;
    private Fixture lastAwayWinAwayTeam;
    private Fixture lastWinHomeTeam;
    private Fixture lastWinAwayTeam;

    private List<Fixture> fixtures;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getTimeFrameStart() {
        return timeFrameStart;
    }

    public void setTimeFrameStart(String timeFrameStart) {
        this.timeFrameStart = timeFrameStart;
    }

    public String getTimeFrameEnd() {
        return timeFrameEnd;
    }

    public void setTimeFrameEnd(String timeFrameEnd) {
        this.timeFrameEnd = timeFrameEnd;
    }

    public Integer getHomeTeamWins() {
        return homeTeamWins;
    }

    public void setHomeTeamWins(Integer homeTeamWins) {
        this.homeTeamWins = homeTeamWins;
    }

    public Integer getAwayTeamWins() {
        return awayTeamWins;
    }

    public void setAwayTeamWins(Integer awayTeamWins) {
        this.awayTeamWins = awayTeamWins;
    }

    public Integer getDraws() {
        return draws;
    }

    public void setDraws(Integer draws) {
        this.draws = draws;
    }

    public Fixture getLastHomeWinHomeTeam() {
        return lastHomeWinHomeTeam;
    }

    public void setLastHomeWinHomeTeam(Fixture lastHomeWinHomeTeam) {
        this.lastHomeWinHomeTeam = lastHomeWinHomeTeam;
    }

    public Fixture getLastWinHomeTeam() {
        return lastWinHomeTeam;
    }

    public void setLastWinHomeTeam(Fixture lastWinHomeTeam) {
        this.lastWinHomeTeam = lastWinHomeTeam;
    }

    public Fixture getLastAwayWinAwayTeam() {
        return lastAwayWinAwayTeam;
    }

    public void setLastAwayWinAwayTeam(Fixture lastAwayWinAwayTeam) {
        this.lastAwayWinAwayTeam = lastAwayWinAwayTeam;
    }

    public Fixture getLastWinAwayTeam() {
        return lastWinAwayTeam;
    }

    public void setLastWinAwayTeam(Fixture lastWinAwayTeam) {
        this.lastWinAwayTeam = lastWinAwayTeam;
    }

    public List<Fixture> getFixtures() {
        return fixtures;
    }

    public void setFixtures(List<Fixture> fixtures) {
        this.fixtures = fixtures;
    }
}
