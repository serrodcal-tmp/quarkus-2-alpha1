package com.serrodcal;

import io.quarkus.vertx.web.Param;
import io.quarkus.vertx.web.Route;
import io.smallrye.mutiny.Uni;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class GreetingResource {

    @Inject
    GreetingService service;

    @Route(path = "/hello", produces = "text/plain")
    public Uni<String> hello() {
        return Uni.createFrom().item("hello");
    }

    @Route(path = "/hello/:name", produces = "text/plain")
    public Uni<String> helloGreeting(@Param("name") String name) {
        return service.helloGreeting(name);
    }

}