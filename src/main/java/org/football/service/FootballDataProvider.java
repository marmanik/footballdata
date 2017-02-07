package org.football.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

/**
 * Created by nmarmaridis on 07-Feb-17.
 */
@Component
public class FootballDataProvider {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private Environment environment;

    public String getProvider(String url){

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        String apiKey = environment.getProperty("API_KEY","");
        headers.set("X-Auth-Token", apiKey);



       // ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

        return "";
    }
}
