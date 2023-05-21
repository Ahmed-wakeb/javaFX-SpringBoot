package com.example.javaFXSpringBootDemo.sensors;

import com.example.javaFXSpringBootDemo.sensors.radarStructure.TrackParameters;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SensorService {

//    private final TrackType trackType;


    public Sensor convertDataFromTrackParmeterToTrackType(TrackParameters trackParameters) {
        return new Sensor(trackParameters,null,5,null,null);
    }
}
