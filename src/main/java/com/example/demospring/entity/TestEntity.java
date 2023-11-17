package com.example.demospring.entity;

import javax.persistence.*;
@Entity
@Table(name = "tutorials")
public class TestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public TestEntity() {
    }

    @Column(name = "title")
    private String title;

    public TestEntity(String title) {
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
