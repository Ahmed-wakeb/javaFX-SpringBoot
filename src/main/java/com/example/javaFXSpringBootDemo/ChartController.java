package com.example.javaFXSpringBootDemo;

import com.example.javaFXSpringBootDemo.testDB.ModelDB;
import com.example.javaFXSpringBootDemo.testDB.ModelService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ChartController {
    private final ModelService modelService;
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
    public void handleSubmit(ActionEvent actionEvent) {
        String data1 = textField1.getText();
        String data2 = textField2.getText();
        String data3 = textField3.getText();
        String data4 = textField4.getText();

        ModelDB modelBuilder = ModelDB.builder()
                .id(data1)
                .userName(data2)
                .password(data3)
                .email(data4)
                .build();


        String result = modelService.addModel(modelBuilder);

        resultLabel.setText(result);


    }

    public void showDataFromDatabase(ActionEvent actionEvent) {
        List<ModelDB> getDataFromDB = modelService.getData();
        getDataDB.setText(getDataFromDB.toString());
    }
}
