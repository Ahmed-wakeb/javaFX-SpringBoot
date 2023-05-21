package com.example.javaFXSpringBootDemo;

import com.example.javaFXSpringBootDemo.sensors.Sensor;
import com.example.javaFXSpringBootDemo.sensors.SensorController;
import com.example.javaFXSpringBootDemo.testDB.ModelService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ChartController {
    private final ModelService modelService;
    private final SensorController sensorController;
    @FXML
    public Label getDataDB;
    @FXML
    private TextField textField1;
    @FXML
    private TextField textField2;
    @FXML
    private TextField textField3;
    @FXML
    private TextField textField4;
    @FXML
    private Label resultLabel;

    @FXML
    public void sendHello(ActionEvent actionEvent) {
//        String data1 = textField1.getText();
//        String data2 = textField2.getText();
//        String data3 = textField3.getText();
//        String data4 = textField4.getText();
//
//        ModelDB modelBuilder = ModelDB.builder()
//                .id(data1)
//                .userName(data2)
//                .password(data3)
//                .email(data4)
//                .build();
//
//
//        String result = modelService.addModel(modelBuilder);
//
//        resultLabel.setText(result);
        sensorController.sayHello("Hi from UI");


    }

    public void showData(ActionEvent actionEvent) {
        Sensor sensor = sensorController.sendData();
        getDataDB.setText(sensor.toString());
    }
}
