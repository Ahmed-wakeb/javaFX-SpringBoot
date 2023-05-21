package com.example.javaFXSpringBootDemo.sensors;

import com.example.javaFXSpringBootDemo.sensors.radarStructure.TrackParameters;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor @Data
public class Sensor {
    private TrackParameters trackParameters;
    private Boolean fireAuthorization;
    private int timeToArrive;
    private TrackType type;
    private Boolean trackTypeOverwritten;
//    private SourceType source;
}
