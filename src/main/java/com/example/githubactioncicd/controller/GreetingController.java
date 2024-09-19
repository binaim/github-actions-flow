package com.example.githubactioncicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("api/v1.0/greetings")
public class GreetingController {
    @GetMapping()
    public String welcomeGreeting(){

        return "Welcome to the Github-Action-Demo";

    }
}
