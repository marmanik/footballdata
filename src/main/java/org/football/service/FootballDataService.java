package org.football.service;

import org.football.domain.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

import static org.football.misc.Params.*;

/**
 * Created by nmarmaridis on 07-Feb-17.
 */
@Service
public class FootballDataService {
    
    @Autowired
    private RestTemplate restTemplate;
    
    private HttpHeaders headers;

    public FootballDataService(String apiKey) {
        this.headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("X-Auth-Token", apiKey);
    }


    public List<Competition> getCompetitionsBySeason(String season) throws JSONException {
        String url = COMPETITIONS.replace("{season}", season);
        String responseBody =  getProvider(url);
        JSONArray jsonArray = new JSONArray(responseBody);
        List<Competition> competitions;
        competitions = ResponseObjectMapper.ToCompetitionList(jsonArray);
        return competitions;
    }

    public Competition getCompetitionById(String id) throws JSONException {
        String url = COMPETITIONS_SINGLE.replace("{id}", id);
        String responseBody =  getProvider(url);
        JSONObject jsonObject = new JSONObject(responseBody);
        Competition competition;
        competition = ResponseObjectMapper.ToCompetition(jsonObject);
        return competition;
    }

    public List<Team> getCompetitionTeamsById(String id) throws JSONException {
        String url = COMPETITIONS_TEAMS.replace("{id}", id);
        String responseBody =  getProvider(url);
        JSONObject jsonObject = new JSONObject(responseBody);
        List<Team> teams;
        teams = ResponseObjectMapper.ToTeamList(jsonObject);
        return teams;
    }

    public Team getTeamById(String id) throws JSONException {
        String url = TEAMS_SINGLE.replace("{id}", id);
        String responseBody =  getProvider(url);
        JSONObject jsonObject = new JSONObject(responseBody);
        Team team;
        team = ResponseObjectMapper.ToTeam(jsonObject);
        return team;
    }

    public LeagueTable getCompetitionLeagueTableById(String id) throws JSONException {
        String url = COMPETITIONS_LEAGUETABLE.replace("{id}", id);
        String responseBody =  getProvider(url);
        JSONObject jsonObject = new JSONObject(responseBody);
        LeagueTable leagueTable;
        leagueTable = ResponseObjectMapper.ToLeagueTable(jsonObject);
        return leagueTable;
    }

    public List<Fixture> getCompetitionFixturesById(String id) throws JSONException {
        String url = COMPETITIONS_FIXTURES.replace("{id}", id);
        String responseBody =  getProvider(url);
        JSONObject jsonObject = new JSONObject(responseBody);
        List<Fixture> fixtures;
        fixtures = ResponseObjectMapper.ToFixtures(jsonObject);
        return fixtures;
    }

    public FixtureSingle getFixtureSingleById(String id) throws JSONException {
        String url = TEAMS_FIXTURES.replace("{id}", id);
        String responseBody =  getProvider(url);
        JSONObject jsonObject = new JSONObject(responseBody);
        FixtureSingle fixtureSingle;
        fixtureSingle = ResponseObjectMapper.ToFixtureSingule(jsonObject);
        return fixtureSingle;
    }

    public List<Player> getTeamPlayersById(String id) throws JSONException {
        String url = TEAMS_PLAYERS.replace("{id}", id);
        String responseBody =  getProvider(url);
        JSONObject jsonObject = new JSONObject(responseBody);
        List<Player> players;
        players = ResponseObjectMapper.ToPlayers(jsonObject);
        return players;
    }


    public String getProvider(String url){

        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

        return response.getBody();
    }
}
