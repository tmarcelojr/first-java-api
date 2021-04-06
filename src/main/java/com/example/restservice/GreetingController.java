package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    // Controller that lets others interact with our API
    // We use the annotation RestController which tells Spring which will be a class that will define some request methods

    private static final String template = "Hello, %s!";
    // %s is a format character indicating 'insert string here'
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    // Spring provides us with request mapping
    // RequestParam allows /greeting?name=Teo, will print out Hello, Teo. Refer to line 14
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
