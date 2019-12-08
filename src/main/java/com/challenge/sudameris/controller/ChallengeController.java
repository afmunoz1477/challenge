package com.challenge.sudameris.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChallengeController {
    @RequestMapping("/")
    public String welcome() {
        return "welcome to my challenge";
    }
    
    @RequestMapping("/hi")
    public String hi() {
        return "Hi y'all";
    }
}
