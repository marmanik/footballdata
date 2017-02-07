package org.football.domain;

import java.util.List;

/**
 * Created by nmarmaridis on 07-Feb-17.
 */
public class LeagueTable {

    private String leagueCaption;
    private Integer matchday;
    private List<Standing> standings;


    public String getLeagueCaption() {
        return leagueCaption;
    }

    public void setLeagueCaption(String leagueCaption) {
        this.leagueCaption = leagueCaption;
    }

    public Integer getMatchday() {
        return matchday;
    }

    public void setMatchday(Integer matchday) {
        this.matchday = matchday;
    }

    public List<Standing> getStandings() {
        return standings;
    }

    public void setStandings(List<Standing> standings) {
        this.standings = standings;
    }
}
