package com.example.javaFXSpringBootDemo;

import javafx.animation.RotateTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.util.Duration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class RadarController {


    @FXML
    private Pane radarPane;

    @FXML
    private Circle radarScreen;

    @FXML
    private Line radarBeam;

    @FXML
    private Button startButton;

    @FXML
    private void startButtonClicked() {
        startRadarAnimation();
        System.out.println("button clicked");
    }

    private void startRadarAnimation() {
        RotateTransition rotateTransition = new RotateTransition(Duration.seconds(2), radarBeam);
        rotateTransition.setByAngle(360);
        rotateTransition.setCycleCount(RotateTransition.INDEFINITE);
        rotateTransition.setAutoReverse(false);
        rotateTransition.play();
    }

    // Add other methods and event handlers as needed

}

