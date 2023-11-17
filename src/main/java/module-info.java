module demoSpring {
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.core;
    requires spring.web;
    requires spring.beans;
    requires java.annotation;

    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.bootstrapfx.core;

    requires java.persistence;
    requires spring.data.jpa;
    requires com.h2database;
    requires spring.jdbc;
    requires org.hibernate.orm.core;
    requires org.hibernate.commons.annotations;
    requires spring.orm;
    requires java.sql;
    requires spring.data.commons;


    exports com.example.demospring;
    opens com.example.demospring to javafx.fxml, spring.core, org.hibernate.orm.core;
    opens com.example.demospring.entity to javafx.fxml, spring.core, org.hibernate.orm.core;
    opens com.example.demospring.repository to javafx.fxml, spring.core, org.hibernate.orm.core;
    opens com.example.demospring.handler to javafx.fxml,spring.beans, spring.core, org.hibernate.orm.core;
}