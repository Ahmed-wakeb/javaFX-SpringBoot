package com.example.javaFXSpringBootDemo.sensors.radarStructure;


import com.example.javaFXSpringBootDemo.sensors.radarStructure.radar10K.Radar10K;
import com.example.javaFXSpringBootDemo.sensors.radarStructure.radar10K.Radar10KController;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
public class RadarController {

    private final Radar10KController radar10KController;
    private final RadarService radarService;

    public MyRadarModel getData(){
        Radar10K radar10K = radar10KController.sendData();
        MyRadarModel myRadarModel = radarService.convertData(radar10K);
        return myRadarModel;
    }

}
