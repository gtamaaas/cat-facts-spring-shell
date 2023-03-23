package com.example.catfactsspringshell;

import org.springframework.web.client.RestTemplate;

public class CatFactClient {

    private String resourceUrl = "https://cat-fact.herokuapp.com/facts/random";

    public String getRandomFact() {
        RestTemplate restTemplate = new RestTemplate();
        CatFact catFact = restTemplate.getForObject(resourceUrl, CatFact.class);
        while(catFact.getStatus().getVerified() == null) {
            catFact = restTemplate.getForObject(resourceUrl, CatFact.class);
        }
        return catFact.toString();
    }


}
