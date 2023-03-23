package com.example.catfactsspringshell;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class HelloCommand {

    @ShellMethod(value="Gives a random verified cat fact")
    public String cat() {
        CatFactClient catFactClient = new CatFactClient();
        return catFactClient.getRandomFact();
    }
}
