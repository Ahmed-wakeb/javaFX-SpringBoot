package com.example.javaFXSpringBootDemo.sensors.radarStructure.radar10K;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor @Data
public class Radar10K {

//    private MyRadarModel myRadarModel;
    private int radar_id;
    private String name;
    private double longitude;
    private double latitude;
    private double altitude;
}
