package org.football;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by nmarmaridis on 07-Feb-17.
 */
@Configuration
@ComponentScan(basePackages = "org.football")
public class ApplicationContext {

    @Bean(name = "restTemplate")
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
