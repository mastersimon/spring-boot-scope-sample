package de.itblogging.spring.scopes;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class Session {

    private int counter = 0;

    public int incrementCounter() {
        return ++counter;
    }
}
