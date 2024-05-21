package com.example.jenkinscicd.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String greeting(){
        return "Welcome to Jenkins Automation World!";
    }
}
