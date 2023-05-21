package com.example.javaFXSpringBootDemo.sensors.radarStructure;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor @Data
public class Radar10K {

    private MyRadarModel myRadarModel;
    private short trackBatch;
    private long timestamp;
    private float distance;
    private float azimuthAngle;
    private float pitchAngle;
    private float radialVelocity;
    private int targetIntensity;
    private double longitude;
    private double latitude;
    private double altitude;
}
