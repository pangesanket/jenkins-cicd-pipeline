package com.example.jenkinscicd.controller;

import com.example.jenkinscicd.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/greeting")
    public ResponseEntity<?> greeting(){
        Map<String, String> map = new HashMap<>();
        map.put("Message", greetingService.greeting());
        return ResponseEntity.ok(map.values());
    }
}
