package de.itblogging.spring.controller;

import de.itblogging.spring.scopes.Application;
import de.itblogging.spring.scopes.Request;
import de.itblogging.spring.scopes.Session;
import de.itblogging.spring.scopes.Singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScopeController {

    @Autowired
    private Request request;

    @Autowired
    private Session session;

    @Autowired
    private Singleton singleton;

    @Autowired
    private Application application;

    @RequestMapping(path = "/scopes", method = RequestMethod.GET)
    public String getScopeCounter() {
        return "RequestScope: " + request.incrementCounter() + "<br>" +
                "SessionScope: " + session.incrementCounter() + "<br>" +
                "Singleton: " + singleton.incrementCounter() + "<br>" +
                "Application: " + application.incrementCounter();
    }

}
