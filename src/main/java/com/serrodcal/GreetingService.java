package com.serrodcal;

import io.smallrye.mutiny.Uni;

import javax.inject.Singleton;

@Singleton
public class GreetingService {

    public Uni<String> helloGreeting(String name) {
        return Uni.createFrom().item("Hello, " + name);
    }

}
