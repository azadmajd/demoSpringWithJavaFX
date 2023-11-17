package com.example.demospring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test12")
    public String getTestString(){
        return "Hello Simple String!";
    }
}
