package org.football;

import org.football.service.FootballDataService;
import org.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
            footballDataService.getCompetitionsBySeason("2016");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCompetitionFixtureService() {

        try {
            footballDataService.getCompetitionFixturesById("426");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCompetitionLeagueService() {

        try {
            footballDataService.getCompetitionLeagueTableById("426");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCompetitionTeamsService() {

        try {
            footballDataService.getCompetitionTeamsById("426");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCompetitionService() {

        try {
            footballDataService.getCompetitionById("426");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void testTeamService() {

        try {
            footballDataService.getTeamById("338");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testTeamPlayersService() {

        try {
            footballDataService.getTeamPlayersById("338");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFixtureSingleService() {

        try {
            footballDataService.getFixtureSingleById("150841");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
