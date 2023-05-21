package com.example.javaFXSpringBootDemo.sensors;

import com.example.javaFXSpringBootDemo.sensors.radarStructure.TrackParameters;
import com.example.javaFXSpringBootDemo.sensors.radarStructure.RadarStructureController;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
public class SensorController {

    private final RadarStructureController radarStructureController;
    private final SensorService sensorService;

    public Sensor sendData(){
        return sensorService.convertDataFromTrackParmeterToTrackType(radarStructureController.getData());
    }


    public void sayHello(String hiFromUi) {
        radarStructureController.sayHelloFromUI(hiFromUi);
    }
}
