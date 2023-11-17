package com.example.demospring.repository;

import com.example.demospring.entity.TestEntity;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface TestRepository extends JpaRepository<TestEntity,Long> {
}
