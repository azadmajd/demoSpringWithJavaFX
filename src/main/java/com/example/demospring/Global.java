package com.example.demospring;

import com.example.demospring.entity.TestEntity;
import com.example.demospring.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class Global {
    public static String uri="http://localhost:8080";
    public static ConfigurableApplicationContext currentContext;
}
