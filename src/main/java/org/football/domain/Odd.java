package org.football.domain;

/**
 * Created by nmarmaridis on 06-Feb-17.
 */
public class Odd {

    private Double homeWin;
    private Double draw;
    private Double awayWin;

    public Double getHomeWin() {
        return homeWin;
    }

    public void setHomeWin(Double homeWin) {
        this.homeWin = homeWin;
    }

    public Double getDraw() {
        return draw;
    }

    public void setDraw(Double draw) {
        this.draw = draw;
    }

    public Double getAwayWin() {
        return awayWin;
    }

    public void setAwayWin(Double awayWin) {
        this.awayWin = awayWin;
    }

    @Override
    public String toString() {
        return "Odd{" +
                "homeWin=" + homeWin +
                ", draw=" + draw +
                ", awayWin=" + awayWin +
                '}';
    }
}
