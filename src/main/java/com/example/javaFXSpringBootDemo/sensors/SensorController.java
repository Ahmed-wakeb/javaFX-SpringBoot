package com.example.javaFXSpringBootDemo.sensors;

import com.example.javaFXSpringBootDemo.sensors.radarStructure.RadarStructureController;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class SensorController {

    private final RadarStructureController radarStructureController;
    private final SensorService sensorService;

    public String sendData(){
        return sensorService.convertDataFromClassifiedTrackParmeterToTrackType(radarStructureController.getData());
    }
    public List<SensorsClassifiedTrackParameters> getDataFromDB(){
        return sensorService.getDataFromDB();
    }


    public void sayHello(String hiFromUi) {
        radarStructureController.sayHelloFromUI(hiFromUi);
    }
}
