package org.football.domain;

/**
 * Created by nmarmaridis on 06-Feb-17.
 */
public class Fixture {

    private Long id;
    private String date;
    private String status;
    private int matchday;
    private String homeTeamName;
    private String awayTeamName;
    private Result result;
    private Odd odds;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getMatchday() {
        return matchday;
    }

    public void setMatchday(int matchday) {
        this.matchday = matchday;
    }

    public String getHomeTeamName() {
        return homeTeamName;
    }

    public void setHomeTeamName(String homeTeamName) {
        this.homeTeamName = homeTeamName;
    }

    public String getAwayTeamName() {
        return awayTeamName;
    }

    public void setAwayTeamName(String awayTeamName) {
        this.awayTeamName = awayTeamName;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public Odd getOdds() {
        return odds;
    }

    public void setOdds(Odd odds) {
        this.odds = odds;
    }
}
