package de.itblogging.spring.scopes;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Singleton {

    private int counter = 0;

    public int incrementCounter() {
        return ++counter;
    }
}
