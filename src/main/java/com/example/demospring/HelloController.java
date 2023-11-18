package com.example.demospring;

import com.example.demospring.entity.TestEntity;
import com.example.demospring.repository.TestRepository;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.net.URL;
import java.util.ResourceBundle;

@Controller
public class HelloController implements Initializable {

    @Autowired
    TestRepository testRepository;

    @FXML
    private Label welcomeText;
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        testRepository.save(new TestEntity("defsss"));
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Platform.runLater(() -> {
            //testRepositoryHandler.callSaveApi();
            testRepository.save(new TestEntity("defsss"));
        });
    }
}