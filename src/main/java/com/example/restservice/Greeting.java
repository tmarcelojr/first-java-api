package com.example.restservice;

public class Greeting {

    private final long id;
    private final String content;

    // final is analogous to const

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }
}
