package com.example.demospring.controller;

import com.example.demospring.entity.TestEntity;
import com.example.demospring.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestRestController {
    @Autowired
    TestRepository testRepository;
    @GetMapping("/save_data")
    public String saveData(){
        testRepository.save(new TestEntity("ededed"));
        return "done";

    }
}
