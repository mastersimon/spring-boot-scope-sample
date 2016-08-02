package de.itblogging.spring.scopes;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class Request {

    private int counter = 0;

    public int incrementCounter() {
        return ++counter;
    }
}
