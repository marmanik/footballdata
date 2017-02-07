package org.football.misc;

/**
 * Created by nmarmaridis on 06-Feb-17.
 */
public final class Params {

    private static final String BASE_URL = "http://api.football-data.org/v1/";

    public static final String COMPETITIONS = BASE_URL + "competitions/?season={season}";
    public static final String COMPETITIONS_SINGLE = BASE_URL + "competitions/{id}";
    public static final String COMPETITIONS_TEAMS = BASE_URL + "competitions/{id}/teams";
    public static final String COMPETITIONS_LEAGUETABLE = BASE_URL + "competitions/{id}/leagueTable";
    public static final String COMPETITIONS_FIXTURES = BASE_URL + "competitions/{id}/fixtures";

    public static final String TEAMS_SINGLE = BASE_URL + "teams/{id}";
    public static final String TEAMS_FIXTURES = BASE_URL + "teams/{id}/fixtures/";
    public static final String TEAMS_PLAYERS = BASE_URL + "teams/{id}/players";
}
