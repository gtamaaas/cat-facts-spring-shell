package com.example.catfactsspringshell.shell;

import com.example.catfactsspringshell.CatFactClient;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class Commands {

    @ShellMethod(value="Gives a random verified cat fact")
    public String cat() {
        CatFactClient catFactClient = new CatFactClient();
        return catFactClient.getRandomFact();
    }
}
