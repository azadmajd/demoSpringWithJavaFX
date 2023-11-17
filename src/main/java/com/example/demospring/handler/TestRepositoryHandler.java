package com.example.demospring.handler;

import com.example.demospring.entity.TestEntity;
import com.example.demospring.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestRepositoryHandler {

    @Autowired
    TestRepository testRepository;
    public void saveTestEntity(TestEntity testEntity){
        testRepository.save(testEntity);
    }
}
