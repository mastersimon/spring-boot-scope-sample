package de.itblogging.spring.scopes;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

@Component
@ApplicationScope
public class Application {

    private int counter = 0;

    public int incrementCounter() {
        return ++counter;
    }
}
