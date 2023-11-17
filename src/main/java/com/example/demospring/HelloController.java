package com.example.demospring;

import com.example.demospring.entity.TestEntity;
import com.example.demospring.handler.TestRepositoryHandler;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloController {
    TestRepositoryHandler testRepositoryHandler=new TestRepositoryHandler();

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        Platform.runLater(() -> {
            testRepositoryHandler.saveTestEntity(new TestEntity("HESSS"));
        });
    }
}