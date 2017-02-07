package org.football;

import org.football.domain.*;
import org.football.service.FootballDataService;
import org.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by nmarmaridis on 07-Feb-17.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationContext.class})
public class ServiceTest {


    @Autowired
    FootballDataService footballDataService;

    @Test
    public void testCompetitionsService() {

        try {
            List<Competition> competitions = footballDataService.getCompetitionsBySeason("2016");

            for (Competition competition : competitions){
                System.out.println(competition);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCompetitionFixtureService() {

        try {
            List<Fixture> fixtures = footballDataService.getCompetitionFixturesById("426");

            for (Fixture fixture : fixtures){
                System.out.println(fixture);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCompetitionLeagueService() {

        try {
            LeagueTable leagueTable = footballDataService.getCompetitionLeagueTableById("426");
            System.out.println(leagueTable);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCompetitionTeamsService() {

        try {
            List<Team> teams = footballDataService.getCompetitionTeamsById("426");
            for (Team team : teams){
                System.out.println(team);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCompetitionService() {

        try {
            Competition competition = footballDataService.getCompetitionById("426");

            System.out.println(competition);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void testTeamFixtureService() {

        try {
            List<Fixture> fixtures = footballDataService.getTeamFixturesById("338");

            for (Fixture fixture : fixtures){
                System.out.println(fixture);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testTeamService() {

        try {
           Team team = footballDataService.getTeamById("338");
            System.out.println(team);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testTeamPlayersService() {

        try {
           List<Player> players = footballDataService.getTeamPlayersById("338");
            for (Player player : players){
                System.out.println(player);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFixtureSingleService() {

        try {
           FixtureSingle fixtureSingle = footballDataService.getFixtureSingleById("150841");
           System.out.print(fixtureSingle);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
