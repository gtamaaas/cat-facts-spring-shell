package com.example.catfactsspringshell.shell;

import com.example.catfactsspringshell.CatFactClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.web.client.RestTemplate;

@ShellComponent
public class Commands {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    CatFactClient catFactClient;

    @ShellMethod(value="Gives a random verified cat fact")
    public String cat() {
        return catFactClient.getRandomFact(restTemplate);
    }
}
