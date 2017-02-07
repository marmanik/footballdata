package org.football.service;

import org.football.domain.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nmarmaridis on 07-Feb-17.
 */
public class ResponseObjectMapper {

    public static List<Competition> ToCompetitionList(JSONArray jsonArray) throws JSONException {
        List<Competition> competitions = new ArrayList<Competition>();

        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            competitions.add(ToCompetition(jsonObject));
        }

        return competitions;
    }

    public static Competition ToCompetition(JSONObject jsonObject) throws JSONException {
        Competition competition = new Competition();

        competition.setId(jsonObject.getLong("id"));
        competition.setCaption(jsonObject.getString("caption"));
        competition.setLeague(jsonObject.getString("league"));
        competition.setYear(jsonObject.getString("year"));
        competition.setCurrentMatchday(jsonObject.getInt("currentMatchday"));
        competition.setNumberOfTeams(jsonObject.getInt("numberOfTeams"));
        competition.setNumberOfGames(jsonObject.getInt("numberOfGames"));
        competition.setLastUpdated(jsonObject.getString("lastUpdated"));

        return competition;
    }

    public static List<Team> ToTeamList(JSONObject jsonObject) throws JSONException {
        List<Team> teams = new ArrayList<Team>();

        JSONArray jsonArray = jsonObject.getJSONArray("teams");

        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObjectTeam = jsonArray.getJSONObject(i);
            teams.add(ToTeam(jsonObjectTeam));
        }
        return teams;
    }

    public static Team ToTeam(JSONObject jsonObject) throws JSONException {
        Team team = new Team();
        String selfLink = jsonObject.getJSONObject("_links").getJSONObject("self").getString("href");
        team.setId(Long.valueOf(getLastBitFromUrl(selfLink)));
        team.setCode(jsonObject.getString("code"));
        team.setCrestUrl(jsonObject.getString("crestUrl"));
        team.setName(jsonObject.getString("name"));
        team.setShortName(jsonObject.getString("shortName"));
        team.setSquadMarketValue(jsonObject.getString("squadMarketValue"));
        return team;

    }

    public static LeagueTable ToLeagueTable(JSONObject jsonObject) throws JSONException {
        LeagueTable leagueTable = new LeagueTable();
        leagueTable.setLeagueCaption(jsonObject.getString("leagueCaption"));
        leagueTable.setMatchday(jsonObject.getInt("matchday"));
        List<Standing> standingList = new ArrayList<Standing>();
        JSONArray jsonArray = jsonObject.getJSONArray("standing");
        for (int i = 0; i < jsonArray.length(); i++) {
            Standing standing = new Standing();
            StandingHome standingHome = new StandingHome();
            StandingAway standingAway = new StandingAway();
            JSONObject jsonObjectStanding = jsonArray.getJSONObject(i);

            standing.setPosition(jsonObjectStanding.getInt("position"));
            standing.setTeamName(jsonObjectStanding.getString("teamName"));
            standing.setCrestURI(jsonObjectStanding.getString("crestURI"));
            standing.setPlayedGames(jsonObjectStanding.getInt("playedGames"));
            standing.setPoints(jsonObjectStanding.getInt("points"));
            standing.setGoals(jsonObjectStanding.getInt("goals"));
            standing.setGoalsAgainst(jsonObjectStanding.getInt("goalsAgainst"));
            standing.setGoalDifference(jsonObjectStanding.getInt("goalDifference"));
            standing.setWins(jsonObjectStanding.getInt("wins"));
            standing.setDraws(jsonObjectStanding.getInt("draws"));
            standing.setLosses(jsonObjectStanding.getInt("losses"));

            JSONObject away = jsonObject.getJSONObject("away");
            standingAway.setWins(away.getInt("wins"));
            standingAway.setGoalsAgainst(away.getInt("goalsAgainst"));
            standingAway.setGoals(away.getInt("goals"));
            standingAway.setLosses(away.getInt("losses"));
            standingAway.setDraws(away.getInt("draws"));

            standing.setAway(standingAway);

            JSONObject home = jsonObject.getJSONObject("home");
            standingHome.setWins(home.getInt("wins"));
            standingHome.setGoalsAgainst(home.getInt("goalsAgainst"));
            standingHome.setGoals(home.getInt("goals"));
            standingHome.setLosses(home.getInt("losses"));
            standingHome.setDraws(home.getInt("draws"));

            standing.setHome(standingHome);
            standingList.add(standing);
        }
        leagueTable.setStandings(standingList);
        return leagueTable;
    }

    public static List<Fixture> ToFixtures(JSONObject jsonObject) throws JSONException {
        List<Fixture> fixtures = new ArrayList<Fixture>();
        JSONArray jsonArray = jsonObject.getJSONArray("fixtures");

        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObjectStanding = jsonArray.getJSONObject(i);

            fixtures.add(ToFixture(jsonObjectStanding));
        }

        return fixtures;
    }

    public static Fixture ToFixture(JSONObject jsonObject) throws JSONException {
        Fixture fixture = new Fixture();
        Result result = new Result();
        Odd odd = new Odd();
        String selfLink = jsonObject.getJSONObject("_links").getJSONObject("self").getString("href");
        fixture.setId(Long.valueOf(getLastBitFromUrl(selfLink)));
        fixture.setStatus(jsonObject.getString("status"));
        fixture.setDate(jsonObject.getString("date"));
        fixture.setMatchday(jsonObject.getInt("matchday"));
        fixture.setHomeTeamName(jsonObject.getString("homeTeamName"));
        fixture.setAwayTeamName(jsonObject.getString("awayTeamName"));

        JSONObject resultInner = jsonObject.getJSONObject("result");
        result.setGoalsAwayTeam(resultInner.getInt("goalsAwayTeam"));
        result.setGoalsHomeTeam(resultInner.getInt("goalsHomeTeam"));

        fixture.setResult(result);

        JSONObject oddInner = jsonObject.getJSONObject("odds");
        odd.setAwayWin(oddInner.getDouble("awayWin"));
        odd.setDraw(oddInner.getDouble("draw"));
        odd.setHomeWin(oddInner.getDouble("homeWin"));

        fixture.setOdds(odd);

        return fixture;
    }

    public static Head2head ToHead2Head(JSONObject jsonObject) throws JSONException {
        Head2head head2head = new Head2head();

        head2head.setCount(jsonObject.getInt("count"));
        head2head.setTimeFrameStart(jsonObject.getString("timeFrameStart"));
        head2head.setTimeFrameEnd(jsonObject.getString("timeFrameEnd"));
        head2head.setHomeTeamWins(jsonObject.getInt("homeTeamWins"));
        head2head.setAwayTeamWins(jsonObject.getInt("awayTeamWins"));
        head2head.setDraws(jsonObject.getInt("draws"));

        head2head.setLastHomeWinHomeTeam(ToFixture(jsonObject.getJSONObject("lastHomeWinHomeTeam")));
        head2head.setLastAwayWinAwayTeam(ToFixture(jsonObject.getJSONObject("lastAwayWinAwayTeam")));
        head2head.setLastWinAwayTeam(ToFixture(jsonObject.getJSONObject("lastWinAwayTeam")));
        head2head.setLastWinHomeTeam(ToFixture(jsonObject.getJSONObject("lastWinHomeTeam")));
        head2head.setFixtures(ToFixtures(jsonObject.getJSONObject("head2head")));

        return head2head;
    }

    public static FixtureSingle ToFixtureSingule(JSONObject jsonObject) throws JSONException {
        FixtureSingle fixtureSingle = new FixtureSingle();
        fixtureSingle.setFixture(ToFixture(jsonObject.getJSONObject("fixture")));
        fixtureSingle.setHead2head(ToHead2Head(jsonObject.getJSONObject("head2head")));

        return fixtureSingle;
    }

    public static List<Player> ToPlayers(JSONObject jsonObject) throws JSONException {

        List<Player> players = new ArrayList<Player>();
        JSONArray jsonArray = jsonObject.getJSONArray("players");
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObjectPlayer = jsonArray.getJSONObject(i);
            Player player = new Player();

            player.setName(jsonObjectPlayer.getString("name"));
            player.setPosition(jsonObjectPlayer.getString("position"));
            player.setContractUntil(jsonObjectPlayer.getString("contractUntil"));
            player.setJerseyNumber(jsonObjectPlayer.getInt("jerseyNumber"));
            player.setDateOfBirth(jsonObjectPlayer.getString("dateOfBirth"));
            player.setNationality(jsonObjectPlayer.getString("nationality"));
            player.setMarketValue(jsonObjectPlayer.getString("marketValue"));

            String selfLink = jsonObject.getJSONObject("_links").getJSONObject("team").getString("href");
            player.setTeamId(Long.valueOf(getLastBitFromUrl(selfLink)));

            players.add(player);
        }

        return players;
    }

    public static String getLastBitFromUrl(final String url) {
        // return url.replaceFirst("[^?]*/(.*?)(?:\\?.*)","$1);" <-- incorrect
        return url.replaceFirst(".*/([^/?]+).*", "$1");
    }


}
