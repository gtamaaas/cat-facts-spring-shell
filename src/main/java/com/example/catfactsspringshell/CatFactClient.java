package com.example.catfactsspringshell;

import com.example.catfactsspringshell.model.CatFact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CatFactClient {

    private String resourceUrl = "https://cat-fact.herokuapp.com/facts/random";
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public String getRandomFact(RestTemplate restTemplate) {
        CatFact catFact = restTemplate.getForObject(resourceUrl, CatFact.class);
        // searches until it finds a suitable cat fact
        while(catFact.getStatus().getVerified() == null) {
            catFact = restTemplate.getForObject(resourceUrl, CatFact.class);
        }
        return catFact.toString();
    }


}
