package com.example.javaFXSpringBootDemo.sensors.radarStructure;


import com.example.javaFXSpringBootDemo.sensors.radarStructure.radar10K.Radar10K;
import com.example.javaFXSpringBootDemo.sensors.radarStructure.radar10K.Radar10KController;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
public class RadarStructureController {

    private final Radar10KController radar10KController;
    private final RadarsService radarsService;

    public TrackParameters getData(){
        Radar10K radar10K = radar10KController.sendData();
        TrackParameters trackParameters = radarsService.convertData(radar10K);
        return trackParameters;
    }

    public void sayHelloFromUI(String hiFromUi) {
        radar10KController.sayHello(hiFromUi);
    }
}
